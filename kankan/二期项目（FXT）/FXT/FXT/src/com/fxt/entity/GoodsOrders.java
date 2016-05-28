package com.fxt.entity;

public class GoodsOrders {
private String gname;
private String pic;
private String destorytime;
private int num;
private float price;
private int status;
private int oid;
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public GoodsOrders(String gname, String pic, String destorytime, int num,
		float price, int status, int oid) {
	super();
	this.gname = gname;
	this.pic = pic;
	this.destorytime = destorytime;
	this.num = num;
	this.price = price;
	this.status = status;
	this.oid = oid;
}
public String getGname() {
	return gname;
}
public void setGname(String gname) {
	this.gname = gname;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public String getDestorytime() {
	return destorytime;
}
public void setDestorytime(String destorytime) {
	this.destorytime = destorytime;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
}
