package com.ss.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ss.dao.BookDao;
import com.ss.dao.BookbuyDao;
import com.ss.dao.BooksaleDao;
import com.ss.dao.impl.BookDaoImpl;
import com.ss.dao.impl.BookbuyDaoImpl;
import com.ss.dao.impl.BooksaleDaoImpl;
import com.ss.entity.Book;
import com.ss.entity.Bookbuy;
import com.ss.entity.Booksale;
import com.ss.factory.BaseAction;

@SuppressWarnings("serial")
public class FindAction extends ActionSupport {
	private BookDao bd=new BookDaoImpl();
	private BookbuyDao bud=new BookbuyDaoImpl();
	private BooksaleDao bsd=new BooksaleDaoImpl();
	private CategoryAction ca=new CategoryAction();
	private PublisherAction pa=new PublisherAction();
	private BaseAction ba=new BaseAction();
	
	private String bookisbn;
	private String bookname;
	private String publisherid;
	private String categoryid;
	private Date zydate;
	private Date zjdate;
	
	public String hc(){
		String sql="";
		if(bookisbn!=""&&!bookisbn.equals("")){
			sql+=" and t_book.bookisbn='"+bookisbn+"'";
		}
		if(bookname!=""&&!bookname.equals("")){
			sql+=" and t_book.bookname="+bookname;
		}
		if(publisherid!=""&&!publisherid.equals("")){
			sql+=" and t_book.publisherid="+publisherid;
		}
		if(categoryid!=""&&!categoryid.equals("")){
			sql+=" and t_book.categoryid="+categoryid;
		}
		return sql;
	}
	
	public String buy(){
		String sql="";
		String str=this.hc();
		sql="select t_bookbuy.bookisbn,t_bookbuy.buydate,t_bookbuy.buynum,t_bookbuy.operator from t_bookbuy,t_book,t_publisher,t_category where " +
		"t_bookbuy.bookisbn=t_book.bookisbn and t_book.publisherid=t_publisher.publisherid and t_book.categoryid=t_category.categoryid"+str;
		if(zydate!=null){
			sql+=" and to_date(t_bookbuy.buydate)>"+zydate;
		}
		if(zjdate!=null){
			sql+=" and to_date(t_bookbuy.buydate)<"+zjdate;
		}
		System.out.println(sql);
		List<Bookbuy> list=bud.que(sql);
		ba.getSession().setAttribute("list", list);
		return "buyList";
	}
	
	public String sale(){
		String sql="";
		String str=this.hc();
		sql="select t_booksale.bookisbn,t_booksale.saledate,t_booksale.salenum,t_booksale.allprice,t_booksale.operator from t_booksale,t_book,t_publisher,t_category where " +
		"t_booksale.bookisbn=t_book.bookisbn and t_book.publisherid=t_publisher.publisherid and t_book.categoryid=t_category.categoryid"+str;
		if(zydate!=null){
			sql+=" and to_date(t_booksale.saledate)>"+zydate;
		}
		if(zjdate!=null){
			sql+=" and to_date(t_booksale.saledate)<"+zjdate;
		}
		System.out.println(sql);
		List<Booksale> list=bsd.que(sql);
		ba.getSession().setAttribute("list", list);
		return "saleList";
	}
	
	public String nownum(){
		String sql="";
		String str=this.hc();
		sql="select bookisbn,bookname,bookdesc,publisherid,author,categoryid,saleprice,nownum,status from t_book where " +
		"1=1 "+str;
		List<Book> list=bd.queBook(sql);
		ba.getSession().setAttribute("list", list);
		return "bookList";
	}
	
	public String findbuy(){
		this.find();
		return "buy";
	}
	public String findsale(){
		this.find();
		return "sale";
	}
	public String findnownum(){
		this.find();
		return "nownum";
	}
	public void find(){
		ca.findAll();
		pa.findAll();
	}
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
	public String getPublisherid() {
		return publisherid;
	}
	public void setPublisherid(String publisherid) {
		this.publisherid = publisherid;
	}
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public Date getZydate() {
		return zydate;
	}

	public void setZydate(Date zydate) {
		this.zydate = zydate;
	}

	public Date getZjdate() {
		return zjdate;
	}

	public void setZjdate(Date zjdate) {
		this.zjdate = zjdate;
	}
	
	
	
}
