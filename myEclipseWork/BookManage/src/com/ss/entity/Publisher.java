package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Publisher implements Serializable {
	private Integer publisherid;
	private String publishername;
	public Integer getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(Integer publisherid) {
		this.publisherid = publisherid;
	}
	public String getPublishername() {
		return publishername;
	}
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publisher(Integer publisherid, String publishername) {
		super();
		this.publisherid = publisherid;
		this.publishername = publishername;
	}
	
}
