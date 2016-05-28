package com.ss.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="t_h8_votecontext")
@SuppressWarnings("serial")
public class Votecontext implements Serializable {
	private Integer id;
	private String context;
	private Integer count;
	private Vote vote;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	//vote
	@ManyToOne
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	public Votecontext() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
