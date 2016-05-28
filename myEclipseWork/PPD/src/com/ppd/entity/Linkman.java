package com.ppd.entity;

/**
 * Linkman entity. @author MyEclipse Persistence Tools
 */

public class Linkman implements java.io.Serializable {

	// Fields

	private Integer linkmanid;
	private Users users;
	private Loan loan;
	private String onelinkman;
	private String onerelation;
	private String onephone;
	private String twolinkman;
	private String tworelation;
	private String twophone;

	// Constructors

	/** default constructor */
	public Linkman() {
	}

	/** full constructor */
	public Linkman(Users users, Loan loan, String onelinkman,
			String onerelation, String onephone, String twolinkman,
			String tworelation, String twophone) {
		this.users = users;
		this.loan = loan;
		this.onelinkman = onelinkman;
		this.onerelation = onerelation;
		this.onephone = onephone;
		this.twolinkman = twolinkman;
		this.tworelation = tworelation;
		this.twophone = twophone;
	}

	// Property accessors

	public Integer getLinkmanid() {
		return this.linkmanid;
	}

	public void setLinkmanid(Integer linkmanid) {
		this.linkmanid = linkmanid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Loan getLoan() {
		return this.loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public String getOnelinkman() {
		return this.onelinkman;
	}

	public void setOnelinkman(String onelinkman) {
		this.onelinkman = onelinkman;
	}

	public String getOnerelation() {
		return this.onerelation;
	}

	public void setOnerelation(String onerelation) {
		this.onerelation = onerelation;
	}

	public String getOnephone() {
		return this.onephone;
	}

	public void setOnephone(String onephone) {
		this.onephone = onephone;
	}

	public String getTwolinkman() {
		return this.twolinkman;
	}

	public void setTwolinkman(String twolinkman) {
		this.twolinkman = twolinkman;
	}

	public String getTworelation() {
		return this.tworelation;
	}

	public void setTworelation(String tworelation) {
		this.tworelation = tworelation;
	}

	public String getTwophone() {
		return this.twophone;
	}

	public void setTwophone(String twophone) {
		this.twophone = twophone;
	}

}