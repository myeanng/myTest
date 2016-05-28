package com.ppd.entity;

/**
 * Safety entity. @author MyEclipse Persistence Tools
 */

public class Safety implements java.io.Serializable {

	// Fields

	private Integer safetyid;
	private Users users;
	private String ic;
	private String tel;
	private String video;

	// Constructors

	/** default constructor */
	public Safety() {
	}

	/** full constructor */
	public Safety(Users users, String ic, String tel, String video) {
		this.users = users;
		this.ic = ic;
		this.tel = tel;
		this.video = video;
	}

	// Property accessors

	public Integer getSafetyid() {
		return this.safetyid;
	}

	public void setSafetyid(Integer safetyid) {
		this.safetyid = safetyid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getIc() {
		return this.ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

}