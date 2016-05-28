package com.ppd.entity;

import java.math.BigDecimal;

/**
 * Credit entity. @author MyEclipse Persistence Tools
 */

public class Credit implements java.io.Serializable {

	// Fields

	private Integer creaitid;
	private Integer rank;
	private BigDecimal maxmoney;
	private Integer criterion;

	// Constructors

	/** default constructor */
	public Credit() {
	}

	/** full constructor */
	public Credit(Integer rank, BigDecimal maxmoney, Integer criterion) {
		this.rank = rank;
		this.maxmoney = maxmoney;
		this.criterion = criterion;
	}

	// Property accessors

	public Integer getCreaitid() {
		return this.creaitid;
	}

	public void setCreaitid(Integer creaitid) {
		this.creaitid = creaitid;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public BigDecimal getMaxmoney() {
		return this.maxmoney;
	}

	public void setMaxmoney(BigDecimal maxmoney) {
		this.maxmoney = maxmoney;
	}

	public Integer getCriterion() {
		return this.criterion;
	}

	public void setCriterion(Integer criterion) {
		this.criterion = criterion;
	}

}