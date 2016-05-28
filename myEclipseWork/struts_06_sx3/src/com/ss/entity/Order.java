package com.ss.entity;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Order implements Serializable {
	private String orderId;
	private Date orderDtm;
	private int state;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDtm() {
		return orderDtm;
	}
	public void setOrderDtm(Date orderDtm) {
		this.orderDtm = orderDtm;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public Order(String orderId, Date orderDtm, int state) {
		super();
		this.orderId = orderId;
		this.orderDtm = orderDtm;
		this.state = state;
	}
	public Order() {
		super();
	}
	
}
