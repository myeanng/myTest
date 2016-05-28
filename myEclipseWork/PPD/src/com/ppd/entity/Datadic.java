package com.ppd.entity;

/**
 * DatadicId entity. @author MyEclipse Persistence Tools
 */

public class Datadic implements java.io.Serializable {

	// Fields

	private Integer firstid;
	private Integer secondid;
	private String content;
	private Integer parentid;

	// Constructors

	/** default constructor */
	public Datadic() {
	}

	/** minimal constructor */
	public Datadic(Integer firstid, Integer secondid) {
		this.firstid = firstid;
		this.secondid = secondid;
	}

	/** full constructor */
	public Datadic(Integer firstid, Integer secondid, String content, Integer parentid) {
		this.firstid = firstid;
		this.secondid = secondid;
		this.content = content;
		this.parentid = parentid;
	}

	// Property accessors

	public Integer getFirstid() {
		return this.firstid;
	}

	public void setFirstid(Integer firstid) {
		this.firstid = firstid;
	}

	public Integer getSecondid() {
		return this.secondid;
	}

	public void setSecondid(Integer secondid) {
		this.secondid = secondid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getParentid() {
		return this.parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

}