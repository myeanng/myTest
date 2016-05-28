package com.ppd.entity;

import java.sql.Date;

/**
 * Operation entity. @author MyEclipse Persistence Tools
 */

public class Operation implements java.io.Serializable {

	// Fields

	private Integer operationid;
	private Employee employee;
	private String empname;
	private Date operationtime;
	private String operationip;
	private String operationname;

	// Constructors

	/** default constructor */
	public Operation() {
	}

	/** full constructor */
	public Operation(Employee employee, String empname,
			Date operationtime, String operationip, String operationname) {
		this.employee = employee;
		this.empname = empname;
		this.operationtime = operationtime;
		this.operationip = operationip;
		this.operationname = operationname;
	}

	// Property accessors

	public Integer getOperationid() {
		return this.operationid;
	}

	public void setOperationid(Integer operationid) {
		this.operationid = operationid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getEmpname() {
		return this.empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Date getOperationtime() {
		return this.operationtime;
	}

	public void setOperationtime(Date operationtime) {
		this.operationtime = operationtime;
	}

	public String getOperationip() {
		return this.operationip;
	}

	public void setOperationip(String operationip) {
		this.operationip = operationip;
	}

	public String getOperationname() {
		return this.operationname;
	}

	public void setOperationname(String operationname) {
		this.operationname = operationname;
	}

}