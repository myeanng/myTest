package com.ss.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="t_h7_type")
@SuppressWarnings("serial")
public class Type implements Serializable {
	private Integer id;
	private String name;
	private Set<Message> messages=new HashSet<Message>();
	
	//id
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
	//messages
	@OneToMany(mappedBy="type")
	public Set<Message> getMessages() {
		return messages;
	}
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
