package com.ppd.entity;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private Integer questionid;
	private String question;

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** full constructor */
	public Question(String question) {
		this.question = question;
	}

	// Property accessors

	public Integer getQuestionid() {
		return this.questionid;
	}

	public void setQuestionid(Integer questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

}