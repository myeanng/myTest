package com.ss.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Demp implements Serializable {
	private Integer id;
	private String name;
	private Set<Emp> emps=new HashSet<Emp>();
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
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	public Demp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
