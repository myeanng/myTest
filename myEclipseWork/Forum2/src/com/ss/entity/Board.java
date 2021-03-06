package com.ss.entity;

import java.io.Serializable;
import java.sql.Timestamp;


@SuppressWarnings("serial")
public class Board implements Serializable {
	private Integer id;
	private Category category;
	private Timestamp dateCreated;
	private Boolean deleted;
	private Integer version;
	private String description;
	private String name;
	private Integer replyCount;
	private Integer threadCount;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}
	public Integer getThreadCount() {
		return threadCount;
	}
	public void setThreadCount(Integer threadCount) {
		this.threadCount = threadCount;
	}
	public Board(Integer id, Category category, Timestamp dateCreated,
			Boolean deleted, Integer version, String description, String name,
			Integer replyCount, Integer threadCount) {
		super();
		this.id = id;
		this.category = category;
		this.dateCreated = dateCreated;
		this.deleted = deleted;
		this.version = version;
		this.description = description;
		this.name = name;
		this.replyCount = replyCount;
		this.threadCount = threadCount;
	}
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
