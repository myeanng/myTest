package com.ss.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Book implements Serializable {
	private String bookisbn;
	private String bookname;
	private String bookdesc;
	private Integer publisherid;
	private String author;
	private Integer categoryid;
	private Double saleprice;
	private Integer nownum;
	private Integer status;
	public String getBookisbn() {
		return bookisbn;
	}
	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookdesc() {
		return bookdesc;
	}
	public void setBookdesc(String bookdesc) {
		this.bookdesc = bookdesc;
	}
	public Integer getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(Integer publisherid) {
		this.publisherid = publisherid;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}
	public Double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}
	public Integer getNownum() {
		return nownum;
	}
	public void setNownum(Integer nownum) {
		this.nownum = nownum;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookisbn, String bookname, String bookdesc,
			Integer publisherid, String author, Integer categoryid,
			Double saleprice, Integer nownum, Integer status) {
		super();
		this.bookisbn = bookisbn;
		this.bookname = bookname;
		this.bookdesc = bookdesc;
		this.publisherid = publisherid;
		this.author = author;
		this.categoryid = categoryid;
		this.saleprice = saleprice;
		this.nownum = nownum;
		this.status = status;
	}
	
	
}
