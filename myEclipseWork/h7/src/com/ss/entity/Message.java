package com.ss.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="t_h7_message")
@SuppressWarnings("serial")
public class Message implements Serializable {
	private Integer id;
	private String title;
	private Double money;
	private Type type;
	private String tel;
	private String person;
	private String content;
	
	//id
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	//type
	@ManyToOne
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
