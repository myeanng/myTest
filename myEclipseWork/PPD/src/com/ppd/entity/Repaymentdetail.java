package com.ppd.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Repaymentdetail entity. @author MyEclipse Persistence Tools
 */

public class Repaymentdetail implements java.io.Serializable {

	// Fields

	private Integer repaymentdetailid;
	private Users users;
	private Loan loan;
	private Integer period;
	private Double rate;
	private BigDecimal principal;
	private BigDecimal interest;
	private Integer status;
	private BigDecimal fine;
	private Date shouldtime;
	private Date repaytime;

	// Constructors

	/** default constructor */
	public Repaymentdetail() {
	}

	/** full constructor */
	public Repaymentdetail(Users users, Loan loan, Integer period, Double rate,
			BigDecimal principal, BigDecimal interest, Integer status, BigDecimal fine,
			Date shouldtime, Date repaytime) {
		this.users = users;
		this.loan = loan;
		this.period = period;
		this.rate = rate;
		this.principal = principal;
		this.interest = interest;
		this.status = status;
		this.fine = fine;
		this.shouldtime = shouldtime;
		this.repaytime = repaytime;
	}

	// Property accessors

	public Integer getRepaymentdetailid() {
		return this.repaymentdetailid;
	}

	public void setRepaymentdetailid(Integer repaymentdetailid) {
		this.repaymentdetailid = repaymentdetailid;
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public BigDecimal getPrincipal() {
		return this.principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getInterest() {
		return this.interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public BigDecimal getFine() {
		return this.fine;
	}

	public void setFine(BigDecimal fine) {
		this.fine = fine;
	}

	public Date getShouldtime() {
		return this.shouldtime;
	}

	public void setShouldtime(Date shouldtime) {
		this.shouldtime = shouldtime;
	}

	public Date getRepaytime() {
		return this.repaytime;
	}

	public void setRepaytime(Date repaytime) {
		this.repaytime = repaytime;
	}

}