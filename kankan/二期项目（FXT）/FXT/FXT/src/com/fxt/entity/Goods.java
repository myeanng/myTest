package com.fxt.entity;

import java.io.Serializable;

public class Goods implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int gid;
	private int did;
	private int gclid;
	private String gname;
	private int num;
	private int supnum;
	private float price;
	private float nowprice;
	private String createtime;
	private String destroytime;
	private String intro;
	private String describe;
	private int isdelete;
	private int ispay;
	private String pic1;
	private String pic2;
	private String pic3;
	private int oid;
	
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
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public int getGclid() {
		return gclid;
	}
	public void setGclid(int gclid) {
		this.gclid = gclid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getSupnum() {
		return supnum;
	}
	public void setSupnum(int supnum) {
		this.supnum = supnum;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getNowprice() {
		return nowprice;
	}
	public void setNowprice(float nowprice) {
		this.nowprice = nowprice;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDestroytime() {
		return destroytime;
	}
	public void setDestroytime(String destroytime) {
		this.destroytime = destroytime;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getPic1() {
		return pic1;
	}
	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}
	public String getPic2() {
		return pic2;
	}
	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}
	public String getPic3() {
		return pic3;
	}
	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}
	public int getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(int isdelete) {
		this.isdelete = isdelete;
	}
	public int getIspay() {
		return ispay;
	}
	public void setIspay(int ispay) {
		this.ispay = ispay;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Goods(int gid, int did, int gclid, String gname, int num,
			int supnum, float price, float nowprice, String createtime,
			String destroytime, String intro, String describe, int isdelete,
			int ispay, String pic1, String pic2, String pic3) {
		super();
		this.gid = gid;
		this.did = did;
		this.gclid = gclid;
		this.gname = gname;
		this.num = num;
		this.supnum = supnum;
		this.price = price;
		this.nowprice = nowprice;
		this.createtime = createtime;
		this.destroytime = destroytime;
		this.intro = intro;
		this.describe = describe;
		this.isdelete = isdelete;
		this.ispay = ispay;
		this.pic1 = pic1;
		this.pic2 = pic2;
		this.pic3 = pic3;
	}
	public Goods() {
		super();
	}
	public Goods(int did, int gclid, String gname, int num, int supnum,
			float price, float nowprice, String createtime, String destroytime,
			String intro, String describe, int isdelete, int ispay,
			String pic1, String pic2, String pic3) {
		super();
		this.did = did;
		this.gclid = gclid;
		this.gname = gname;
		this.num = num;
		this.supnum = supnum;
		this.price = price;
		this.nowprice = nowprice;
		this.createtime = createtime;
		this.destroytime = destroytime;
		this.intro = intro;
		this.describe = describe;
		this.isdelete = isdelete;
		this.ispay = ispay;
		this.pic1 = pic1;
		this.pic2 = pic2;
		this.pic3 = pic3;
	}
	public Goods(int gid, int did, int gclid, String gname, int num,
			float price, float nowprice, String destroytime, String intro,
			String describe) {
		super();
		this.gid = gid;
		this.did = did;
		this.gclid = gclid;
		this.gname = gname;
		this.num = num;
		this.price = price;
		this.nowprice = nowprice;
		this.destroytime = destroytime;
		this.intro = intro;
		this.describe = describe;
	}
	public Goods(int gid, String gname, float price) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
	}
	public Goods(int gid, int did, int gclid, String gname, int num,
			int supnum, float price, float nowprice, String createtime,
			String destroytime, String intro, String describe, int isdelete,
			int ispay, String pic1, String pic2, String pic3, int oid) {
		super();
		this.gid = gid;
		this.did = did;
		this.gclid = gclid;
		this.gname = gname;
		this.num = num;
		this.supnum = supnum;
		this.price = price;
		this.nowprice = nowprice;
		this.createtime = createtime;
		this.destroytime = destroytime;
		this.intro = intro;
		this.describe = describe;
		this.isdelete = isdelete;
		this.ispay = ispay;
		this.pic1 = pic1;
		this.pic2 = pic2;
		this.pic3 = pic3;
		this.oid = oid;
	}
	
	
}
