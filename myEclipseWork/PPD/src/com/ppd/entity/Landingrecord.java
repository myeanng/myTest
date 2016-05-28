package com.ppd.entity;

import java.util.Date;



/**
 * Landingrecord entity. @author MyEclipse Persistence Tools
 */

public class Landingrecord implements java.io.Serializable {

	// Fields

	private Integer landingid;
	private Users users;
	private Date landingtime;
	private String landingip;

	// Constructors

	/** default constructor */
	public Landingrecord() {
	}

	/** full constructor */
	public Landingrecord(Users users, Date landingtime, String landingip) {
		this.users = users;
		this.landingtime = landingtime;
		this.landingip = landingip;
	}

	// Property accessors

	public Integer getLandingid() {
		return this.landingid;
	}

	public void setLandingid(Integer landingid) {
		this.landingid = landingid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getLandingtime() {
		return this.landingtime;
	}

	public void setLandingtime(Date landingtime) {
		this.landingtime = landingtime;
	}

	public String getLandingip() {
		return this.landingip;
	}

	public void setLandingip(String landingip) {
		this.landingip = landingip;
	}

}