package com.ss.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@SuppressWarnings("serial")
public class Person implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	private Boolean deleted;
	private Date dateCreated;
	private String account;
	private String sex;
	private String name;
	private String birthday;
	private String email;
	private String ipCreated;
	private Date dateLastActived;
	private String ipLastActived;
	private String password;
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
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
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
	public Date getDateLastActived() {
		return dateLastActived;
	}
	public void setDateLastActived(Date dateLastActived) {
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
	public Person(Integer id, Boolean deleted, Date dateCreated,
			String account, String sex, String name, String birthday,
			String email, String ipCreated, Date dateLastActived,
			String ipLastActived, String password) {
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
	}
	
}
