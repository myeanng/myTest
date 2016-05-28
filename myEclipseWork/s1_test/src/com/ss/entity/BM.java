package com.ss.entity;

import javax.persistence.*;

@Entity
@Table(name="t_s1_BM")
public class BM {
	private Integer id;
	private String name;
	private Integer num;
	@Id
	@GeneratedValue
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
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public BM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BM(String name, Integer num) {
		super();
		this.name = name;
		this.num = num;
	}
	public BM(Integer id, String name, Integer num) {
		super();
		this.id = id;
		this.name = name;
		this.num = num;
	}
	
}
