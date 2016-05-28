package com.ppd.entity;

import java.util.Date;


/**
 * Bank entity. @author MyEclipse Persistence Tools
 */

public class Bank implements java.io.Serializable {

	// Fields

	private Integer bankcardid;
	private Users users;
	private String cardnum;
	private String createbank;
	private Date createtime;
	private Integer status;

	// Constructors

	/** default constructor */
	public Bank() {
	}

	/** full constructor */
	public Bank(Users users, String cardnum, String createbank,
			Date createtime, Integer status) {
		this.users = users;
		this.cardnum = cardnum;
		this.createbank = createbank;
		this.createtime = createtime;
		this.status = status;
	}

	// Property accessors

	public Integer getBankcardid() {
		return this.bankcardid;
	}

	public void setBankcardid(Integer bankcardid) {
		this.bankcardid = bankcardid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getCardnum() {
		return this.cardnum;
	}

	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	public String getCreatebank() {
		return this.createbank;
	}

	public void setCreatebank(String createbank) {
		this.createbank = createbank;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}