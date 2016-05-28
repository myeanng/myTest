package com.ppd.entity;

import java.sql.Date;

/**
 * Material entity. @author MyEclipse Persistence Tools
 */

public class Material implements java.io.Serializable {

	// Fields

	private Integer materialid;
	private Users users;
	private Loan loan;
	private String material;
	private String picture;
	private Date createtime;

	// Constructors

	/** default constructor */
	public Material() {
	}

	/** full constructor */
	public Material(Users users, Loan loan, String material, String picture,
			Date createtime) {
		this.users = users;
		this.loan = loan;
		this.material = material;
		this.picture = picture;
		this.createtime = createtime;
	}

	// Property accessors

	public Integer getMaterialid() {
		return this.materialid;
	}

	public void setMaterialid(Integer materialid) {
		this.materialid = materialid;
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

	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}