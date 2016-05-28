package com.ss.action;

import java.io.IOException;
import java.io.PrintWriter;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ss.dao.BookDao;
import com.ss.dao.BookbuyDao;
import com.ss.dao.BooksaleDao;
import com.ss.dao.impl.BookDaoImpl;
import com.ss.dao.impl.BookbuyDaoImpl;
import com.ss.dao.impl.BooksaleDaoImpl;
import com.ss.entity.Book;
import com.ss.entity.Bookbuy;
import com.ss.entity.Booksale;
import com.ss.entity.User;
import com.ss.factory.BaseAction;

@SuppressWarnings("serial")
public class BookAction extends ActionSupport implements ModelDriven<Book> {
	private Book b=new Book();
	private Integer buynum;
	private Integer salenum;
	private Double allprice;

	private BookDao bd=new BookDaoImpl();
	private BookbuyDao bud=new BookbuyDaoImpl();
	private BooksaleDao bsd=new BooksaleDaoImpl();
	private CategoryAction ca=new CategoryAction();
	private PublisherAction pa=new PublisherAction();
	private BaseAction ba=new BaseAction();
	//插入进货表
	public String buy(){
		int i=bd.add(b);
		if(i>0){
			java.util.Date nowdate=new java.util.Date();
			System.out.println(nowdate.toString());
			System.out.println(buynum);
			User u=(User)ba.getSession().getAttribute("user");
			System.out.println(u.getLoginname());
			Bookbuy bookbuy=new Bookbuy(b.getBookisbn(),nowdate,b.getNownum(),u.getLoginname());
			int j=bud.add(bookbuy);
			if(j>0){
				return SUCCESS;
			}else{
				return "error";
			}
		}else{
			return "error";
		}
	}
	//插入销售表
	public String sale(){
		java.util.Date nowdate=new java.util.Date();
		User u=(User)ba.getSession().getAttribute("user");
		Booksale booksale=new Booksale(b.getBookisbn(),nowdate,salenum,allprice,u.getLoginname());
		int j=bsd.add(booksale);
		if(j>0){
			//修改BOOK数量
			Book book=bd.queISBN(b.getBookisbn());
			book.setNownum((book.getNownum()-salenum));
			int k=bd.upd(book);
			if(k>0){
				return SUCCESS;}else{
				return "error";
			}
		}else{
			return "error";
		}
	}
	//根据编号查询图书
	public void ajax() throws IOException{
		PrintWriter out=ba.getResponse().getWriter();
		Book book=bd.queISBN(b.getBookisbn());
		if(book!=null){
			
			//合成json字符串
			String json="{\"bookname\":\""+book.getBookname()+"\",\"author\":\""+book.getAuthor()+"\",\"bookdesc\":\""+book.getBookdesc()+"\",\"publisherid\":\""+book.getPublisherid()+"\",\"categoryid\":\""+book.getCategoryid()+"\",\"saleprice\":\""+book.getSaleprice()+"\",\"nownum\":\""+book.getNownum()+"\"}";
			out.print(json);
			System.out.println(json);
		}else{
			System.out.println("1");
			out.print("");
		}	
	}
	
	public void find(){
		ca.findAll();
		pa.findAll();
	}
	
	public String findbuy(){
		this.find();
		return "buy";
	}
	public String findsale(){
		this.find();
		return "sale";
	}

	public Integer getBuynum() {
		return buynum;
	}
	public void setBuynum(Integer buynum) {
		this.buynum = buynum;
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
	public Book getModel() {
		// TODO Auto-generated method stub
		return b;
	}
}
