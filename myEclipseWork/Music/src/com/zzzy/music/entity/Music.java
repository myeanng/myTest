package com.zzzy.music.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="mt_music")
@SuppressWarnings("serial")
public class Music implements Serializable {
	private Integer id;
	private String title;
	//����
	private String singer;
	//����ר��
	private String special;
	//����
	private String mscvalue;
	//�ϴ�ʱ��
	private Timestamp msctime;
	//�����
	private Integer click;
	private String url;
	//��Զ�(���û��ղص�����)
	private Set<User> users=new HashSet<User>();
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public String getMscvalue() {
		return mscvalue;
	}
	public void setMscvalue(String mscvalue) {
		this.mscvalue = mscvalue;
	}
	public Timestamp getMsctime() {
		return msctime;
	}
	public void setMsctime(Timestamp msctime) {
		this.msctime = msctime;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@ManyToMany(mappedBy="musics")
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
