package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Role implements Serializable {
	private Integer roleid;
	private String role;
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(Integer roleid, String role) {
		super();
		this.roleid = roleid;
		this.role = role;
	}
	
}
