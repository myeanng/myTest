package com.fxt.entity;

import java.io.Serializable;

public class District implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int did;
	private String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public District() {
		super();
	}
	public District(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	

}
