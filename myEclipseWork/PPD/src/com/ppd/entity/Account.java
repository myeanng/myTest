package com.ppd.entity;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account implements java.io.Serializable {

	// Fields

	private Integer accountid;
	private Users users;
	private String accountpassword;
	private Double allmoney;
	private Double outmoney;
	private Double inmoney;
	private Double allinvest;
	private Double allloan;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(Users users, String accountpassword, Double allmoney,
			Double outmoney, Double inmoney, Double allinvest, Double allloan) {
		this.users = users;
		this.accountpassword = accountpassword;
		this.allmoney = allmoney;
		this.outmoney = outmoney;
		this.inmoney = inmoney;
		this.allinvest = allinvest;
		this.allloan = allloan;
	}

	// Property accessors

	public Integer getAccountid() {
		return this.accountid;
	}

	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getAccountpassword() {
		return this.accountpassword;
	}

	public void setAccountpassword(String accountpassword) {
		this.accountpassword = accountpassword;
	}

	public Double getAllmoney() {
		return this.allmoney;
	}

	public void setAllmoney(Double allmoney) {
		this.allmoney = allmoney;
	}

	public Double getOutmoney() {
		return this.outmoney;
	}

	public void setOutmoney(Double outmoney) {
		this.outmoney = outmoney;
	}

	public Double getInmoney() {
		return this.inmoney;
	}

	public void setInmoney(Double inmoney) {
		this.inmoney = inmoney;
	}

	public Double getAllinvest() {
		return this.allinvest;
	}

	public void setAllinvest(Double allinvest) {
		this.allinvest = allinvest;
	}

	public Double getAllloan() {
		return this.allloan;
	}

	public void setAllloan(Double allloan) {
		this.allloan = allloan;
	}

}