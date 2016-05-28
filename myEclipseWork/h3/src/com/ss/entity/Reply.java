package com.ss.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="f_reply")
@SuppressWarnings("serial")
public class Reply implements Serializable {
	private Integer id;
	private String title;
	private Person author;
	private Timestamp dateCreated;
	private Thread thread;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Reply(Integer id, String title, Person author, Timestamp dateCreated) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.dateCreated = dateCreated;
	}
	public Reply() {
		super();
		// TODO Auto-generated constructor stub
	}
	//¶à¶ÔÒ»(°å¿é)
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="tid")
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	
}
