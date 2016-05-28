package com.ss.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="t_h8_admin")
@SuppressWarnings("serial")
public class Admin implements Serializable {
	private Integer id;
	private String name;
	private String pwd;
	private Timestamp logintime;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Timestamp getLogintime() {
		return logintime;
	}
	public void setLogintime(Timestamp logintime) {
		this.logintime = logintime;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
