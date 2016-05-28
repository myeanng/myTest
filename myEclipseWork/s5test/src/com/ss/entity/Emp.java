package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Integer id;
	private String name;
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
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
