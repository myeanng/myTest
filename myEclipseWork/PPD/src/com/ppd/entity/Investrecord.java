package com.ppd.entity;


import java.math.BigDecimal;
import java.util.Date;

/**
 * Investrecord entity. @author MyEclipse Persistence Tools
 */

public class Investrecord implements java.io.Serializable {

	// Fields

	private Integer investid;
	private Users users;
	private Loan loan;
	private BigDecimal money;
	private Date investtime;
	private Double rate;

	// Constructors

	/** default constructor */
	public Investrecord() {
	}

	/** full constructor */
	public Investrecord(Users users, Loan loan, BigDecimal money,
			Date investtime, Double rate) {
		this.users = users;
		this.loan = loan;
		this.money = money;
		this.investtime = investtime;
		this.rate = rate;
	}

	// Property accessors

	public Integer getInvestid() {
		return this.investid;
	}

	public void setInvestid(Integer investid) {
		this.investid = investid;
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

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public Date getInvesttime() {
		return this.investtime;
	}

	public void setInvesttime(Date investtime) {
		this.investtime = investtime;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

}