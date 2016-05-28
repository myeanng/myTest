package com.ppd.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer empid;
	private Role role;
	private String empname;
	private String tel;
	private String address;
	private String loginpassword;
	private Date createtime;
	private Date lastlogintime;
	private String lastloginip;
	private Integer status;
	private String ic;
	private List operations = new ArrayList(0);

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(Role role, String empname, String tel, String address,
			String loginpassword, Date createtime,
			Date lastlogintime, String lastloginip, Integer status,
			String ic, List operations) {
		this.role = role;
		this.empname = empname;
		this.tel = tel;
		this.address = address;
		this.loginpassword = loginpassword;
		this.createtime = createtime;
		this.lastlogintime = lastlogintime;
		this.lastloginip = lastloginip;
		this.status = status;
		this.ic = ic;
		this.operations = operations;
	}

	// Property accessors

	public Integer getEmpid() {
		return this.empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLoginpassword() {
		return this.loginpassword;
	}

	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getLastlogintime() {
		return this.lastlogintime;
	}

	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public String getLastloginip() {
		return this.lastloginip;
	}

	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIc() {
		return this.ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public List getOperations() {
		return this.operations;
	}

	public void setOperations(List operations) {
		this.operations = operations;
	}

}