package com.ppd.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Rainbowinvest entity. @author MyEclipse Persistence Tools
 */

public class Rainbowinvest implements java.io.Serializable {

	// Fields

	private Integer rainbowinvestid;
	private Rainbow rainbow;
	private Users users;
	private BigDecimal money;
	private Integer periods;
	private Double rate;
	private Date createtime;
	private BigDecimal duein;
	private Date overtime;

	// Constructors

	/** default constructor */
	public Rainbowinvest() {
	}

	/** full constructor */
	public Rainbowinvest(Rainbow rainbow, Users users, BigDecimal money,
			Integer periods, Double rate, Date createtime, BigDecimal duein,
			Date overtime) {
		this.rainbow = rainbow;
		this.users = users;
		this.money = money;
		this.periods = periods;
		this.rate = rate;
		this.createtime = createtime;
		this.duein = duein;
		this.overtime = overtime;
	}

	// Property accessors

	public Integer getRainbowinvestid() {
		return this.rainbowinvestid;
	}

	public void setRainbowinvestid(Integer rainbowinvestid) {
		this.rainbowinvestid = rainbowinvestid;
	}

	public Rainbow getRainbow() {
		return this.rainbow;
	}

	public void setRainbow(Rainbow rainbow) {
		this.rainbow = rainbow;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
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

	public BigDecimal getDuein() {
		return this.duein;
	}

	public void setDuein(BigDecimal duein) {
		this.duein = duein;
	}

	public Date getOvertime() {
		return this.overtime;
	}

	public void setOvertime(Date overtime) {
		this.overtime = overtime;
	}

}