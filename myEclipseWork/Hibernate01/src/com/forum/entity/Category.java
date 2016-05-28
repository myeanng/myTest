package com.forum.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Category implements Serializable {
	private Integer id;
	private Timestamp dateCreated;
	private Boolean deleted;
	private Integer version;
	private String name;
	//包含的板块集合
	private Set<Board> boards=new HashSet<Board>();
	
	
	
	//id
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//boards
	//@OneToMany(mappedBy="category")
	public Set<Board> getBoards() {
		return boards;
	}
	public void setBoards(Set<Board> boards) {
		this.boards = boards;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(Integer id, Timestamp dateCreated, Boolean deleted,
			Integer version, String name, Set<Board> boards) {
		super();
		this.id = id;
		this.dateCreated = dateCreated;
		this.deleted = deleted;
		this.version = version;
		this.name = name;
		this.boards = boards;
	}
	
	
	
}
