package com.zzzy.music.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="mt_message")
@SuppressWarnings("serial")
public class Message implements Serializable {
	private Integer id;
	//发消息用户
	private User formUser;
	//接收消息用户
	private User toUsre;
	//标题
	private String title;
	//消息内容
	private String msgvalue;
	//发消息时间
	private Timestamp msgtime;
	//是否是新消息(新消息为1,已读为0)
	private Integer msgIsNew;
	//一对一(祝福的歌曲)
	private Music music;
	//是否匿名
	private Integer noname;
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@ManyToOne
	public User getFormUser() {
		return formUser;
	}
	public void setFormUser(User formUser) {
		this.formUser = formUser;
	}
	@ManyToOne
	public User getToUsre() {
		return toUsre;
	}
	public void setToUsre(User toUsre) {
		this.toUsre = toUsre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMsgvalue() {
		return msgvalue;
	}
	public void setMsgvalue(String msgvalue) {
		this.msgvalue = msgvalue;
	}
	public Timestamp getMsgtime() {
		return msgtime;
	}
	public void setMsgtime(Timestamp msgtime) {
		this.msgtime = msgtime;
	}
	public Integer getMsgIsNew() {
		return msgIsNew;
	}
	public void setMsgIsNew(Integer msgIsNew) {
		this.msgIsNew = msgIsNew;
	}
	@ManyToOne
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	public Integer getNoname() {
		return noname;
	}
	public void setNoname(Integer noname) {
		this.noname = noname;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
