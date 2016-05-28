package com.ppd.entity;

/**
 * Standard entity. @author MyEclipse Persistence Tools
 */

public class Standard implements java.io.Serializable {

	// Fields

	private Integer standardid;
	private String name;
	private String scope;
	private String standard;

	// Constructors

	/** default constructor */
	public Standard() {
	}

	/** full constructor */
	public Standard(String name, String scope, String standard) {
		this.name = name;
		this.scope = scope;
		this.standard = standard;
	}

	// Property accessors

	public Integer getStandardid() {
		return this.standardid;
	}

	public void setStandardid(Integer standardid) {
		this.standardid = standardid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

}