package com.ss.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.dao.PowerDao;
import com.ss.dao.RelationDao;
import com.ss.dao.UserDao;
import com.ss.dao.impl.PowerDaoImpl;
import com.ss.dao.impl.RelationDaoImpl;
import com.ss.dao.impl.UserDaoImpl;
import com.ss.entity.Power;
import com.ss.entity.Relation;
import com.ss.entity.User;
import com.ss.factory.BaseAction;

@SuppressWarnings("serial")
public class AdminAction extends ActionSupport implements ModelDriven<User> {
	private User user=new User();
	private BaseAction ba=new BaseAction();
	private UserDao ud=new UserDaoImpl();
	private RelationDao rd=new RelationDaoImpl();
	private PowerDao pd=new PowerDaoImpl();
	//��½
	public String login(){
		User u=ud.queUser(user.getLoginname(), user.getLoginpwd());
		if(u!=null){
			ba.getSession().setAttribute("user", u);
			List<Relation> list= rd.que(u.getRoleid());
			List<Power> powerList=pd.que(list);
			ba.getSession().setAttribute("powerList", powerList);
			return SUCCESS;
		}
		return "error";
	}
	//��ѯ�����û�
	public String findAll(){
		List<User> list=ud.queAll();
		if(list!=null){
			ba.getSession().setAttribute("userList", list);
			return "list";
		}
		return "error";
	}
	//Ajax�ж��˺������Ƿ���ȷ
	public void ajax() throws IOException{
		PrintWriter out=ba.getResponse().getWriter();
		User u=ud.queUser(user.getLoginname(), user.getLoginpwd());
		if(u!=null){
			out.print(true);
		}else{
			out.print(false);
		}
		
	}
	//Ajax�ж��û����Ƿ����
	public void ajaxName() throws IOException{
		PrintWriter out=ba.getResponse().getWriter();
		boolean b=ud.queName(user.getLoginname());
		if(b){
			out.print(true);
		}else{
			out.print(false);
		}	
	}
	//�޸�����
	public String updatepwd(){
		int i=ud.updPwd(user.getLoginname(), user.getLoginpwd());
		if(i>0){
			return this.findAll();
		}
		return "error";
	}
	//����û�
	public String add(){
		int i=ud.add(user);
		if(i>0){
			return this.findAll();
		}
		return "error";
	}
	//ɾ���û�
	public String del(){
		int i=ud.del(user.getUserid());
		if(i>0){
			return this.findAll();
		}
		return "error";
	}
	//�˳�
	public String exit(){
		ba.getSession().removeAttribute("user");
		ba.getSession().removeAttribute("powerList");
		ba.getSession().removeAttribute("userList");
		ba.getSession().removeAttribute("publisherList");
		ba.getSession().removeAttribute("CategoryList");
		ba.getSession().removeAttribute("list");
		return "exit";
	}
	//����Ȩ��
	public String uproleid(){
		int i=ud.updRoleid(user.getUserid(), user.getRoleid());
		if(i>0){
			return this.findAll();
		}
		return "error";
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
}
