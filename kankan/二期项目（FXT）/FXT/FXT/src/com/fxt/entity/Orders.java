package com.fxt.entity;

import java.io.Serializable;

public class Orders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int oid;
	private int gid;
	private int uid;
	private int num;
	private float totalprice;
	private String createtime;
	private String uname;
	private String address;
	private String tel;
	private int status;
	private int isdelete;
	private String beizhu;
	private int gcid;
	private String gcname;
	private int xsl;
	
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
	public int getXsl() {
		return xsl;
	}
	public void setXsl(int xsl) {
		this.xsl = xsl;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Orders() {
		super();
	}
	public Orders(int oid, int gid, int uid, int num, float totalprice,
			String createtime, String uname, String address, String tel,
			int status, int isdelete, String beizhu) {
		super();
		this.oid = oid;
		this.gid = gid;
		this.uid = uid;
		this.num = num;
		this.totalprice = totalprice;
		this.createtime = createtime;
		this.uname = uname;
		this.address = address;
		this.tel = tel;
		this.status = status;
		this.isdelete = isdelete;
		this.beizhu = beizhu;
	}
	public Orders(int oid, int uid, int num, float totalprice,
			String createtime, String uname, String address, String tel,
			int status, int isdelete, String beizhu) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.num = num;
		this.totalprice = totalprice;
		this.createtime = createtime;
		this.uname = uname;
		this.address = address;
		this.tel = tel;
		this.status = status;
		this.isdelete = isdelete;
		this.beizhu = beizhu;
	}
	public Orders(int oid, int gid, int uid, int num, float totalprice,
			String createtime, String uname, String address, String tel,
			int status) {
		super();
		this.oid = oid;
		this.gid = gid;
		this.uid = uid;
		this.num = num;
		this.totalprice = totalprice;
		this.createtime = createtime;
		this.uname = uname;
		this.address = address;
		this.tel = tel;
		this.status = status;
	}
	public Orders(int gid, int uid, int num, float totalprice, String uname,
			String address, String tel) {
		super();
		this.gid = gid;
		this.uid = uid;
		this.num = num;
		this.totalprice = totalprice;
		this.uname = uname;
		this.address = address;
		this.tel = tel;
	}
	public Orders(int gid, int uid, int num, float totalprice) {
		super();
		this.gid = gid;
		this.uid = uid;
		this.num = num;
		this.totalprice = totalprice;
	}
	public Orders(int gcid, String gcname, int xsl) {
		super();
		this.gcid = gcid;
		this.gcname = gcname;
		this.xsl = xsl;
	}
	
	
}
