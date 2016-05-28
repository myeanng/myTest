package com.zzzy.music.web.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zzzy.music.biz.MusicBiz;
import com.zzzy.music.entity.Message;
import com.zzzy.music.entity.Music;
import com.zzzy.music.entity.Tip;
import com.zzzy.music.entity.User;
import com.zzzy.music.factory.BaseAction;
@Controller()
@Scope("prototype")
@Results({@Result(location="/index.jsp"),@Result(name="login",location="/music/login.jsp")
	,@Result(name="user",type="redirect",location="/music/usernull.jsp")
	,@Result(name="index",type="redirect",location="index.jsp")
	,@Result(name="addMusic2",type="redirect",location="/music/addMusic2.jsp")
	,@Result(name="body",type="redirect",location="/music/body.jsp")
	,@Result(name="chenggong",type="redirect",location="/music/chenggong.jsp")
	,@Result(name="showMessage",type="redirect",location="/music/showMessage.jsp")
	,@Result(name="messageList",type="redirect",location="/music/messageList.jsp")
	,@Result(name="musicBox",type="redirect",location="/music/musicBox.jsp")
})
//@InterceptorRef(value="defaultStack")
//@InterceptorRef(value="fileUpload")
@SuppressWarnings("serial")
public class MusicAction extends ActionSupport {
	//注入Biz
	@Autowired
	private MusicBiz musicBiz;
	//创建各个作用域的辅助类
	private BaseAction baseAction=new BaseAction();
	//对应各个表单的实体类
	private User user;
	private Music music;
	private Tip tip;
	private Message message;
	//上传歌曲定义File对象
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	//匿名
	private Integer niming=1;
	//messageIds消息id的集合
	private String[] messageIds;
	//音乐盒Id集合
	private String[] musicIds;
	
	//添加用户
	@Action("music-addUser")
	public String addUser(){
		musicBiz.addUser(user);
		return "login";
	}
	//登陆
	@Action("music-login")
	public String login(){
		user=musicBiz.findUser(user.getName(), user.getPwd());
		baseAction.getSession().setAttribute("user", user);
		List<Message> list=musicBiz.findMyMessage(user.getId());
		baseAction.getSession().setAttribute("messageNum", list.size());
		baseAction.getSession().setAttribute("messagelist", list);
		baseAction.getSession().setAttribute("musiclist", musicBiz.findAllMusic());
		baseAction.getSession().setAttribute("tiplist", musicBiz.findAllTip());
		return "user";
	}
	//首页跳转
	@Action("music-hello")
	public String hello(){
		
		if(baseAction.getSession().getAttribute("user")!=null||"".equals(baseAction.getSession().getAttribute("user"))){
			user=(User)baseAction.getSession().getAttribute("user");
			List<Message> list=musicBiz.findMyMessage(user.getId());
			baseAction.getSession().setAttribute("messageNum", list.size());
			baseAction.getSession().setAttribute("messagelist", list);
		}
		baseAction.getSession().setAttribute("musiclist", musicBiz.findAllMusic());
		baseAction.getSession().setAttribute("tiplist", musicBiz.findAllTip());
		return "index";
	}
	//上传歌曲文件
	@Action("music-addMusicURL")
	
	public String addMusicURL() throws Exception{
		String fileName=ServletActionContext.getServletContext().getRealPath("/upload")+"\\"+getUploadFileName();
		FileOutputStream fos=new FileOutputStream(fileName);
		FileInputStream fis=new FileInputStream(getUpload());
		byte[] b=new byte[1024];
		int len=0;
		while((len=fis.read(b))>0){
			fos.write(b,0,len);
		}
		fos.close();
		fis.close();
		fileName=fileName.substring(fileName.lastIndexOf("upload"), fileName.length());
		baseAction.getSession().setAttribute("musicURL", fileName);
		return "addMusic2";
	}
	
	//上传歌曲信息
	@Action("music-addMusic")
	public String addMusic(){
		music.setClick(0);
		music.setMsctime(new Timestamp(new Date().getTime()));
		music.setUrl(baseAction.getSession().getAttribute("musicURL").toString());
		musicBiz.addMusic(music);
		System.out.println(baseAction.getSession().getAttribute("user"));
		tip=new Tip();
		tip.setTipvalue("["+((User)baseAction.getSession().getAttribute("user")).getName()+"]分享了歌曲["+music.getTitle()+"]");
		System.out.println(tip.getTipvalue());
		musicBiz.addTip(tip);
		return "chenggong";
	}
	
	//点歌
	@Action("music-addMessage")
	public String addMessage(){
		
		message.setFormUser((User)baseAction.getSession().getAttribute("user"));
		message.setMsgIsNew(1);
		message.setMsgtime(new Timestamp(new Date().getTime()));
		String toname=message.getToUsre().getName();
		if(niming==0){
			message.setTitle("有人为您点了一首歌");
		}else{
			message.setNoname(niming);
			message.setTitle(toname+"为您点了一首歌");
		}
		message.setToUsre(musicBiz.findUser(toname));
		
		musicBiz.addMessage(message);
		return "chenggong";
	}
	
	//删除消息
	@Action("music-deleteMessage")
	public String deleteMessage(){
		user=(User)baseAction.getSession().getAttribute("user");
		List<Message> list=musicBiz.findMyMessage(user.getId());;
		for (String mid : messageIds) {
			Integer id=Integer.parseInt(mid);
			for (Message message : list) {
				if(message.getId().intValue()==id.intValue()){
					list.remove(message);
					break;
				}
			}
			musicBiz.deleteMessage(id);
		}
		baseAction.getSession().setAttribute("messageNum", list.size());
		baseAction.getSession().setAttribute("messagelist", list);
		return "messageList";
	}
	//查找单个消息的内容
	@Action("music-showMessage")
	public String showMessage(){
		message=musicBiz.findMessage(message.getId());
		message.setMsgIsNew(0);
		musicBiz.updateMessage(message);
		baseAction.getSession().setAttribute("message",message);
		return "showMessage";
	}
	
	//移除收藏的音乐
	@Action("music-delectMusicBox")
	public String delectMusicBox(){
		user=(User)baseAction.getSession().getAttribute("user");
		for (String idstr : musicIds) {
			Integer id=Integer.parseInt(idstr);
			for (Music music : user.getMusics()) {
				if(music.getId().intValue()==id.intValue()){
					user.getMusics().remove(music);
					break;
				}
			}
		}
		musicBiz.updateUser(user);
		return "musicBox";
	}
	
	//查找收藏的音乐
	@Action("music-musicBox")
	public String musicBox(){
		user=(User)baseAction.getSession().getAttribute("user");
		user=musicBiz.findUser(user.getId());
		baseAction.getSession().setAttribute("user", user);
		return "musicBox";
	}
	
	//收藏音乐
	@Action("music-addToMusicBox")
	public String addToMusicBox(){
		user=(User)baseAction.getSession().getAttribute("user");
		User u=musicBiz.findUser(user.getId());
		Music m=musicBiz.findMusic(music.getId());
		u.getMusics().add(m);
		musicBiz.updateUser(u);
		return musicBox();
	}
	//判断用户名是否存在
	@Action("music-ajaxToName")
	public void ajaxToName() throws IOException{
		PrintWriter out=baseAction.getResponse().getWriter();
		User u=musicBiz.findUser(message.getToUsre().getName());
		if(u!=null){
			out.print(true);
		}else{
			out.print(false);
		}
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public Tip getTip() {
		return tip;
	}

	public void setTip(Tip tip) {
		this.tip = tip;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public MusicBiz getMusicBiz() {
		return musicBiz;
	}

	public void setMusicBiz(MusicBiz musicBiz) {
		this.musicBiz = musicBiz;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public Integer getNiming() {
		return niming;
	}
	public void setNiming(Integer niming) {
		this.niming = niming;
	}
	public String[] getMessageIds() {
		return messageIds;
	}
	public void setMessageIds(String[] messageIds) {
		this.messageIds = messageIds;
	}
	public String[] getMusicIds() {
		return musicIds;
	}
	public void setMusicIds(String[] musicIds) {
		this.musicIds = musicIds;
	}
	
}
