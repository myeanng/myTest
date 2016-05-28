package com.fxt.entity;

import java.io.Serializable;

public class Cart implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cid;
	private int uid;
	private int gid;
	private String gname;
	private String gpic1;
	private int num;
	private float totalmoney;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getGpic1() {
		return gpic1;
	}
	public void setGpic1(String gpic1) {
		this.gpic1 = gpic1;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getTotalmoney() {
		return totalmoney;
	}
	public void setTotalmoney(float totalmoney) {
		this.totalmoney = totalmoney;
	}
	public Cart(int cid, int uid, int gid, int num, float totalmoney) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.gid = gid;
		this.num = num;
		this.totalmoney = totalmoney;
	}
	public Cart() {
		super();
	}
	public Cart(int uid, int gid, int num, float totalmoney) {
		super();
		this.uid = uid;
		this.gid = gid;
		this.num = num;
		this.totalmoney = totalmoney;
	}
	public Cart(int gid, int num, float totalmoney) {
		super();
		this.gid = gid;
		this.num = num;
		this.totalmoney = totalmoney;
	}
	public Cart(int gid, String gname, String gpic1, int num, float totalmoney) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gpic1 = gpic1;
		this.num = num;
		this.totalmoney = totalmoney;
	}
	public Cart(int uid, int gid, String gname, String gpic1, int num,
			float totalmoney) {
		super();
		this.uid = uid;
		this.gid = gid;
		this.gname = gname;
		this.gpic1 = gpic1;
		this.num = num;
		this.totalmoney = totalmoney;
	}
	public Cart(int cid, int uid, int gid, String gname, String gpic1, int num,
			float totalmoney) {
		super();
		this.cid = cid;
		this.uid = uid;
		this.gid = gid;
		this.gname = gname;
		this.gpic1 = gpic1;
		this.num = num;
		this.totalmoney = totalmoney;
	}
	
	
	
}
