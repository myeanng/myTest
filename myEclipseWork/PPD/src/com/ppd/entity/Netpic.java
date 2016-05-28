package com.ppd.entity;

/**
 * Netpic entity. @author MyEclipse Persistence Tools
 */

public class Netpic implements java.io.Serializable {

	// Fields

	private Integer netpicid;
	private String picaddress;
	private String picurl;

	// Constructors

	/** default constructor */
	public Netpic() {
	}

	/** full constructor */
	public Netpic(String picaddress, String picurl) {
		this.picaddress = picaddress;
		this.picurl = picurl;
	}

	// Property accessors

	public Integer getNetpicid() {
		return this.netpicid;
	}

	public void setNetpicid(Integer netpicid) {
		this.netpicid = netpicid;
	}

	public String getPicaddress() {
		return this.picaddress;
	}

	public void setPicaddress(String picaddress) {
		this.picaddress = picaddress;
	}

	public String getPicurl() {
		return this.picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}

}