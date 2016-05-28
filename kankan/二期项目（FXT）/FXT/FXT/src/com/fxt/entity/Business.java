package com.fxt.entity;

import java.io.Serializable;
import java.util.Date;

public class Business implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bid;
	private int payerid;
	private int payeeid;
	private float money;
	private Date time;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getPayerid() {
		return payerid;
	}
	public void setPayerid(int payerid) {
		this.payerid = payerid;
	}
	public int getPayeeid() {
		return payeeid;
	}
	public void setPayeeid(int payeeid) {
		this.payeeid = payeeid;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Business(int bid, int payerid, int payeeid, float money, Date time) {
		super();
		this.bid = bid;
		this.payerid = payerid;
		this.payeeid = payeeid;
		this.money = money;
		this.time = time;
	}
	public Business() {
		super();
	}
	
}
