package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class User implements Serializable {
	private Integer  userid;
	private String loginname;
	private String loginpwd;
	private Integer roleid;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpwd() {
		return loginpwd;
	}
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userid, String loginname, String loginpwd,
			Integer roleid) {
		super();
		this.userid = userid;
		this.loginname = loginname;
		this.loginpwd = loginpwd;
		this.roleid = roleid;
	}
	
	
}
