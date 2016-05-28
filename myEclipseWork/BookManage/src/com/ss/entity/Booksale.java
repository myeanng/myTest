package com.ss.entity;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Booksale implements Serializable {
	private String bookisbn;
	private Date saledate;
	private Integer salenum;
	private Double allprice;
	private String operator;
	public String getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}
	public Date getSaledate() {
		return saledate;
	}
	public void setSaledate(Date saledate) {
		this.saledate = saledate;
	}
	public Integer getSalenum() {
		return salenum;
	}
	public void setSalenum(Integer salenum) {
		this.salenum = salenum;
	}
	public Double getAllprice() {
		return allprice;
	}
	public void setAllprice(Double allprice) {
		this.allprice = allprice;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Booksale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booksale(String bookisbn, Date saledate, Integer salenum,
			Double allprice, String operator) {
		super();
		this.bookisbn = bookisbn;
		this.saledate = saledate;
		this.salenum = salenum;
		this.allprice = allprice;
		this.operator = operator;
	}
	
}
