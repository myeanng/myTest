package com.ss.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Cust implements Serializable {
	private String custId;
	private String custName;
	private String tel;
	private List<Order> orders=new ArrayList<Order>();
	public Cust() {
		super();
	}
	public Cust(String custId, String custName, String tel, List<Order> orders) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.tel = tel;
		this.orders = orders;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Cust(String custId, String custName, String tel) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.tel = tel;
	}
	
}
