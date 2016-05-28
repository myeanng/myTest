package com.ss.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="f_thread")
@SuppressWarnings("serial")
public class Thread implements Serializable {
	private Integer id;
	private String title;
	//作者
	private Person author;
	//帖子描述
	private String description;
	//发帖时间
	private Timestamp dateCreated;
	//回复列表
	private List<Reply> replys;
	//所属板块
	private Board board;
	
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
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="pid")
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
	@OneToMany(mappedBy="thread")
	public List<Reply> getReplys() {
		return replys;
	}
	public void setReplys(List<Reply> replys) {
		this.replys = replys;
	}
	public Thread() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//多对一(板块)
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,optional=true)
	@JoinColumn(name="bid")
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public Thread(Integer id, String title, Person author, String description,
			Timestamp dateCreated, List<Reply> replys, Board board) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.dateCreated = dateCreated;
		this.replys = replys;
		this.board = board;
	}
	
	
}
