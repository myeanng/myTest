package com.fxt.entity;

import java.io.Serializable;

public class GoodsClassList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int gclid;
	private int gcid;
	private String gclname;
	public int getGclid() {
		return gclid;
	}
	public void setGclid(int gclid) {
		this.gclid = gclid;
	}
	public int getGcid() {
		return gcid;
	}
	public void setGcid(int gcid) {
		this.gcid = gcid;
	}
	public String getGclname() {
		return gclname;
	}
	public void setGclname(String gclname) {
		this.gclname = gclname;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public GoodsClassList() {
		super();
	}
	public GoodsClassList(int gclid, int gcid, String gclname) {
		super();
		this.gclid = gclid;
		this.gcid = gcid;
		this.gclname = gclname;
	}
	

}
