package com.ss.entity;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Bookbuy implements Serializable {
	private String bookisbn;
	private Date buydate;
	private Integer buynum;
	private String operator;
	public String getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}
	public Date getBuydate() {
		return buydate;
	}
	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}
	public Integer getBuynum() {
		return buynum;
	}
	public void setBuynum(Integer buynum) {
		this.buynum = buynum;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Bookbuy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bookbuy(String bookisbn, Date buydate, Integer buynum,
			String operator) {
		super();
		this.bookisbn = bookisbn;
		this.buydate = buydate;
		this.buynum = buynum;
		this.operator = operator;
	}
	
}
