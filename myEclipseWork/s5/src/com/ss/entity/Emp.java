package com.ss.entity;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Integer id;
	private String name;
	private String zw;
	private Float money;
	private Float jj;
	private Timestamp createDate;
	private Demp demp;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZw() {
		return zw;
	}
	public void setZw(String zw) {
		this.zw = zw;
	}
	public Float getMoney() {
		return money;
	}
	public void setMoney(Float money) {
		this.money = money;
	}
	public Float getJj() {
		return jj;
	}
	public void setJj(Float jj) {
		this.jj = jj;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Demp getDemp() {
		return demp;
	}
	public void setDemp(Demp demp) {
		this.demp = demp;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
