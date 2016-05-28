package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {
	private Integer id;
	private String name;
	private String birthday;
	private Integer height;
	private Integer weight;
	private String ph;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public Student(Integer id, String name, String birthday, Integer height,
			Integer weight, String ph) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
		this.ph = ph;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
