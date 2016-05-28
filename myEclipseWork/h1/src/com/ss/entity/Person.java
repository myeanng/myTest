package com.ss.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="t_person")
@SuppressWarnings("serial")
public class Person implements Serializable {
	private Integer id;
	private Boolean deleted;
	private Timestamp dateCreated;
	private String account;
	private String sex;
	private String name;
	private String birthday;
	private String email;
	private String ipCreated;
	private Timestamp dateLastActived;
	private String ipLastActived;
	private String password;
	private Set<Board> boards=new HashSet<Board>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="t_BP",joinColumns={@JoinColumn(name="pid")},inverseJoinColumns={@JoinColumn(name="bid")})
	public Set<Board> getBoards() {
		return boards;
	}
	public void setBoards(Set<Board> boards) {
		this.boards = boards;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer id, Boolean deleted, Timestamp dateCreated,
			String account, String sex, String name, String birthday,
			String email, String ipCreated, Timestamp dateLastActived,
			String ipLastActived, String password, Set<Board> boards) {
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
	}
	
	
}
