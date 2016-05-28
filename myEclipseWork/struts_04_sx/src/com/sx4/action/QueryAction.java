package com.sx4.action;

import java.util.ArrayList;
import java.util.List;

import com.sx4.dao.BookDao;
import com.sx4.dao.impl.BookDaoImpl;
import com.sx4.entity.Book;
import com.sx4.factory.BaseAction;




public class QueryAction extends BaseAction {
	BookDao bd=new BookDaoImpl();
	List<Book> booklist=new ArrayList<Book>();
	private String key;
	public String queryByName() throws Exception {
		booklist=bd.findName("NAME",key);
		this.getRequest().setAttribute("booklist", booklist);
		return "dui";
	}
	public String queryByAuthor() throws Exception {
		booklist=bd.findName("AUTHOR", key);
		this.getRequest().setAttribute("booklist", booklist);
		return "dui";
	}
	public String queryByPublish() throws Exception {
		booklist=bd.findName("PUBLISH", key);
		this.getRequest().setAttribute("booklist", booklist);
		return "dui";
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
