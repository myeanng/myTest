package com.ppd.entity;

/**
 * Protect entity. @author MyEclipse Persistence Tools
 */

public class Protect implements java.io.Serializable {

	// Fields

	private Integer protectid;
	private Users users;
	private String question;
	private String answer;

	// Constructors

	/** default constructor */
	public Protect() {
	}

	/** full constructor */
	public Protect(Users users, String question, String answer) {
		this.users = users;
		this.question = question;
		this.answer = answer;
	}

	// Property accessors

	public Integer getProtectid() {
		return this.protectid;
	}

	public void setProtectid(Integer protectid) {
		this.protectid = protectid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}