package com.ppd.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private Integer roleid;
	private Authority authority;
	private String rolename;
	private List employees = new ArrayList(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(Authority authority, String rolename, List employees) {
		this.authority = authority;
		this.rolename = rolename;
		this.employees = employees;
	}

	// Property accessors

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public Authority getAuthority() {
		return this.authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List getEmployees() {
		return this.employees;
	}

	public void setEmployees(List employees) {
		this.employees = employees;
	}

}