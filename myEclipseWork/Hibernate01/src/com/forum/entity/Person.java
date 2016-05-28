package com.forum.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Person implements Serializable {
	private Integer id;
	private Boolean deleted;
	//注册时间
	private Timestamp dateCreated;
	//用户名
	private String account;
	private String sex;
	private String name;
	private String birthday;
	private String email;
	//注册IP
	private String ipCreated;
	//最后登录时间
	private Timestamp dateLastActived;
	//最后登录IP
	private String ipLastActived;
	private String password;
	//管理的板块集合
	private Set<Board> boards=new HashSet<Board>();
	//发表的帖子集合
	private Set<Thread> threads=new HashSet<Thread>();
	//发表的评论
	private Set<Reply> replys=new HashSet<Reply>();
	
	//id
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIpCreated() {
		return ipCreated;
	}
	public void setIpCreated(String ipCreated) {
		this.ipCreated = ipCreated;
	}
	public Timestamp getDateLastActived() {
		return dateLastActived;
	}
	public void setDateLastActived(Timestamp dateLastActived) {
		this.dateLastActived = dateLastActived;
	}
	public String getIpLastActived() {
		return ipLastActived;
	}
	public void setIpLastActived(String ipLastActived) {
		this.ipLastActived = ipLastActived;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//boards
	//@ManyToMany(cascade=CascadeType.ALL)
	//@JoinTable(name="person_board",joinColumns={@JoinColumn(name="pid")},inverseJoinColumns={@JoinColumn(name="bid")})
	public Set<Board> getBoards() {
		return boards;
	}
	public void setBoards(Set<Board> boards) {
		this.boards = boards;
	}
	//threads
	//@OneToMany(mappedBy="author")
	public Set<Thread> getThreads() {
		return threads;
	}
	public void setThreads(Set<Thread> threads) {
		this.threads = threads;
	}
	//reply
	//@OneToMany(mappedBy="person")
	public Set<Reply> getReplys() {
		return replys;
	}
	public void setReplys(Set<Reply> replys) {
		this.replys = replys;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer id, Boolean deleted, Timestamp dateCreated,
			String account, String sex, String name, String birthday,
			String email, String ipCreated, Timestamp dateLastActived,
			String ipLastActived, String password, Set<Board> boards,
			Set<Thread> threads, Set<Reply> replys) {
		super();
		this.id = id;
		this.deleted = deleted;
		this.dateCreated = dateCreated;
		this.account = account;
		this.sex = sex;
		this.name = name;
		this.birthday = birthday;
		this.email = email;
		this.ipCreated = ipCreated;
		this.dateLastActived = dateLastActived;
		this.ipLastActived = ipLastActived;
		this.password = password;
		this.boards = boards;
		this.threads = threads;
		this.replys = replys;
	}
	
}
