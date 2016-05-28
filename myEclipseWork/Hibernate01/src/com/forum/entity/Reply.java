package com.forum.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Reply implements Serializable {
	private Integer id;
	private Boolean deleted;
	private Timestamp dateCreated;
	private Integer version;
	private String content;
	private Integer floor;
	private String ipCreated;
	private String title;
	//所属帖子
	private Thread thread;
	//所属用户
	private Person person;
	
	
	
	//id
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getFloor() {
		return floor;
	}
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	public String getIpCreated() {
		return ipCreated;
	}
	public void setIpCreated(String ipCreated) {
		this.ipCreated = ipCreated;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//thread
	//@OneToOne
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	//person
	//@ManyToOne
	public Person getAuthor() {
		return person;
	}
	public void setAuthor(Person person) {
		this.person = person;
	}
	public Reply(Integer id, Boolean deleted, Timestamp dateCreated,
			Integer version, String content, Integer floor, String ipCreated,
			String title, Thread thread, Person person) {
		super();
		this.id = id;
		this.deleted = deleted;
		this.dateCreated = dateCreated;
		this.version = version;
		this.content = content;
		this.floor = floor;
		this.ipCreated = ipCreated;
		this.title = title;
		this.thread = thread;
		this.person = person;
	}
	
}
