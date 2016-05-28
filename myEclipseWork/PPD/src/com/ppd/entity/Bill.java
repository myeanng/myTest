package com.ppd.entity;

import java.util.Date;

/**
 * Bill entity. @author MyEclipse Persistence Tools
 */

public class Bill implements java.io.Serializable {

	// Fields

	private Integer billid;
	private Users users;
	private Loan loan;
	private Double money;
	private Integer class_;
	private String state;
	private Date createtime;

	// Constructors

	/** default constructor */
	public Bill() {
	}

	/** full constructor */
	public Bill(Users users, Loan loan, Double money, Integer class_,
			String state, Date createtime) {
		this.users = users;
		this.loan = loan;
		this.money = money;
		this.class_ = class_;
		this.state = state;
		this.createtime = createtime;
	}

	// Property accessors

	public Integer getBillid() {
		return this.billid;
	}

	public void setBillid(Integer billid) {
		this.billid = billid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getClass_() {
		return this.class_;
	}

	public void setClass_(Integer class_) {
		this.class_ = class_;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}