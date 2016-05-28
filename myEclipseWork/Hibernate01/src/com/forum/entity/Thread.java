package com.forum.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Thread implements Serializable {
	private Integer id;
	private String title;
	private Boolean deleted;
	private Integer version;
	private String content;
	private Integer hit;
	private String ipCreated;
	private Integer readonly;
	private Integer replyCount;
	private Integer topped;
	//最后回复时间
	private Timestamp dateLastReplied;
	//发帖时间
	private Timestamp dateCreated;
	//帖子拥有者
	private Person author;
	//回复列表
	private List<Reply> replys;
	//所属板块
	private Board board;
	//最后回复的帖子
	private Reply reply;
	
	
	
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getHit() {
		return hit;
	}
	public void setHit(Integer hit) {
		this.hit = hit;
	}
	public String getIpCreated() {
		return ipCreated;
	}
	public void setIpCreated(String ipCreated) {
		this.ipCreated = ipCreated;
	}
	public Integer getReadonly() {
		return readonly;
	}
	public void setReadonly(Integer readonly) {
		this.readonly = readonly;
	}
	public Integer getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}
	public Integer getTopped() {
		return topped;
	}
	public void setTopped(Integer topped) {
		this.topped = topped;
	}
	public Timestamp getDateLastReplied() {
		return dateLastReplied;
	}
	public void setDateLastReplied(Timestamp dateLastReplied) {
		this.dateLastReplied = dateLastReplied;
	}
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	//author
	//@ManyToOne
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}
	//replys
	//@OneToMany(mappedBy="thread")
	public List<Reply> getReplys() {
		return replys;
	}
	public void setReplys(List<Reply> replys) {
		this.replys = replys;
	}
	//board
	//@ManyToOne
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	//reply
	//@OneToOne(fetch=FetchType.EAGER)
	public Reply getReply() {
		return reply;
	}
	public void setReply(Reply reply) {
		this.reply = reply;
	}
	public Thread() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Thread(Integer id, String title, Boolean deleted, Integer version,
			String content, Integer hit, String ipCreated, Integer readonly,
			Integer replyCount, Integer topped, Timestamp dateLastReplied,
			Timestamp dateCreated, Person author, List<Reply> replys,
			Board board, Reply reply) {
		super();
		this.id = id;
		this.title = title;
		this.deleted = deleted;
		this.version = version;
		this.content = content;
		this.hit = hit;
		this.ipCreated = ipCreated;
		this.readonly = readonly;
		this.replyCount = replyCount;
		this.topped = topped;
		this.dateLastReplied = dateLastReplied;
		this.dateCreated = dateCreated;
		this.author = author;
		this.replys = replys;
		this.board = board;
		this.reply = reply;
	}
	
}
