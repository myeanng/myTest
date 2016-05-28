package com.fxt.entity;

import java.io.Serializable;

public class GoodsClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int gcid;
	private String gcname;
	public int getGcid() {
		return gcid;
	}
	public void setGcid(int gcid) {
		this.gcid = gcid;
	}
	public String getGcname() {
		return gcname;
	}
	public void setGcname(String gcname) {
		this.gcname = gcname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public GoodsClass() {
		super();
	}
	public GoodsClass(int gcid, String gcname) {
		super();
		this.gcid = gcid;
		this.gcname = gcname;
	}
	

}
