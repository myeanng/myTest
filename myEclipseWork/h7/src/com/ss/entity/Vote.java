package com.ss.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="t_h8_vote")
@SuppressWarnings("serial")
public class Vote implements Serializable {
	private Integer id;
	private String title;
	private Timestamp dateCreated;
	private Byte type;
	private Byte publish;
	private Admin admin;
	private Set<Votecontext> votecontexts = new HashSet<Votecontext>();
	
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
	public Timestamp getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Byte getType() {
		return type;
	}
	public void setType(Byte type) {
		this.type = type;
	}
	public Byte getPublish() {
		return publish;
	}
	public void setPublish(Byte publish) {
		this.publish = publish;
	}
	@ManyToOne
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	//Votecontexts
	@OrderBy("id")
	@OneToMany(mappedBy="vote",cascade=CascadeType.ALL)
	public Set<Votecontext> getVotecontexts() {
		return votecontexts;
	}
	public void setVotecontexts(Set<Votecontext> votecontexts) {
		this.votecontexts = votecontexts;
	}
	public Vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
