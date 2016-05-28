package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Power implements Serializable {
	private Integer powerid;
	private String power;
	private Integer pid;
	private String href;
	public Integer getPowerid() {
		return powerid;
	}
	public void setPowerid(Integer powerid) {
		this.powerid = powerid;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public Power(Integer powerid, String power, Integer pid, String href) {
		super();
		this.powerid = powerid;
		this.power = power;
		this.pid = pid;
		this.href = href;
	}
	public Power() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
