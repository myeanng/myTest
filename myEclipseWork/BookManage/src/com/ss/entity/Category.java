package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Category implements Serializable {
	private Integer categoryid;
	private String categoryname;
	private String categorydesc;
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getCategorydesc() {
		return categorydesc;
	}
	public void setCategorydesc(String categorydesc) {
		this.categorydesc = categorydesc;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer categoryid, String categoryname, String categorydesc) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.categorydesc = categorydesc;
	}
	
}
