package com.forum.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@SuppressWarnings("serial")
public class Board implements Serializable {
	private Integer id;
	//所属类别
	private Category category;
	private Timestamp dateCreated;
	private Boolean deleted;
	private Integer version;
	private String description;
	private String name;
	private Integer replyCount;
	private Integer threadCount;
	//最后创建的板块
	private Thread lastThread;
	//板块的管理员
	private Set<Person> persons=new HashSet<Person>();
	//板块的帖子
	private Set<Thread> threads=new HashSet<Thread>();
	
	
	
	//id
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//category
	//@ManyToOne
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
	//lastThread
	//@OneToOne(mappedBy="board")
	public Thread getLastThread() {
		return lastThread;
	}
	public void setLastThread(Thread lastThread) {
		this.lastThread = lastThread;
	}
	//persons
	//@ManyToMany(cascade=CascadeType.ALL)
	//@JoinTable(name="person_board",joinColumns={@JoinColumn(name="bid")},inverseJoinColumns={@JoinColumn(name="pid")})
	public Set<Person> getPersons() {
		return persons;
	}
	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	//threads
	//@OneToMany(mappedBy="board",fetch=FetchType.EAGER)
	public Set<Thread> getThreads() {
		return threads;
	}
	public void setThreads(Set<Thread> threads) {
		this.threads = threads;
	}
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(Integer id, Category category, Timestamp dateCreated,
			Boolean deleted, Integer version, String description, String name,
			Integer replyCount, Integer threadCount, Thread lastThread,
			Set<Person> persons, Set<Thread> threads) {
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
		this.lastThread = lastThread;
		this.persons = persons;
		this.threads = threads;
	}
	
}
