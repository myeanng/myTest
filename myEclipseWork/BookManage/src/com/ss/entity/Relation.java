package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Relation implements Serializable {
	private Integer roleid;
	private Integer powerid;
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public Integer getPowerid() {
		return powerid;
	}
	public void setPowerid(Integer powerid) {
		this.powerid = powerid;
	}
	public Relation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Relation(Integer roleid, Integer powerid) {
		super();
		this.roleid = roleid;
		this.powerid = powerid;
	}
	
}
