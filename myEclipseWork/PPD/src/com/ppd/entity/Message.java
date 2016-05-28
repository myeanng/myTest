package com.ppd.entity;

import java.sql.Date;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Integer messageid;
	private Users usersByTouserid;
	private Users usersBySenduserid;
	private String message;
	private Date createtime;
	private Integer status;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** full constructor */
	public Message(Users usersByTouserid, Users usersBySenduserid,
			String message, Date createtime, Integer status) {
		this.usersByTouserid = usersByTouserid;
		this.usersBySenduserid = usersBySenduserid;
		this.message = message;
		this.createtime = createtime;
		this.status = status;
	}

	// Property accessors

	public Integer getMessageid() {
		return this.messageid;
	}

	public void setMessageid(Integer messageid) {
		this.messageid = messageid;
	}

	public Users getUsersByTouserid() {
		return this.usersByTouserid;
	}

	public void setUsersByTouserid(Users usersByTouserid) {
		this.usersByTouserid = usersByTouserid;
	}

	public Users getUsersBySenduserid() {
		return this.usersBySenduserid;
	}

	public void setUsersBySenduserid(Users usersBySenduserid) {
		this.usersBySenduserid = usersBySenduserid;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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