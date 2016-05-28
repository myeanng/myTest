package com.ss.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="t_h8_voter")
@SuppressWarnings("serial")
public class Voter implements Serializable {
	private Integer id;
	private Vote vote;
	private String ip;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	//vote
	public Vote getVote() {
		return vote;
	}
	public void setVote(Vote vote) {
		this.vote = vote;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Voter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
