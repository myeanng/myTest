package com.ppd.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Rainbow entity. @author MyEclipse Persistence Tools
 */

public class Rainbow implements java.io.Serializable {

	// Fields

	private Integer rainbowid;
	private BigDecimal money;
	private BigDecimal loanmoney;
	private Integer periods;
	private Double rate;
	private Date createtime;
	private List rainbowinvests = new ArrayList(0);

	// Constructors

	/** default constructor */
	public Rainbow() {
	}

	/** full constructor */
	public Rainbow(BigDecimal money, BigDecimal loanmoney, Integer periods, Double rate,
			Date createtime, List rainbowinvests) {
		this.money = money;
		this.loanmoney = loanmoney;
		this.periods = periods;
		this.rate = rate;
		this.createtime = createtime;
		this.rainbowinvests = rainbowinvests;
	}

	// Property accessors

	public Integer getRainbowid() {
		return this.rainbowid;
	}

	public void setRainbowid(Integer rainbowid) {
		this.rainbowid = rainbowid;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public BigDecimal getLoanmoney() {
		return this.loanmoney;
	}

	public void setLoanmoney(BigDecimal loanmoney) {
		this.loanmoney = loanmoney;
	}

	public Integer getPeriods() {
		return this.periods;
	}

	public void setPeriods(Integer periods) {
		this.periods = periods;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public List getRainbowinvests() {
		return this.rainbowinvests;
	}

	public void setRainbowinvests(List rainbowinvests) {
		this.rainbowinvests = rainbowinvests;
	}

}