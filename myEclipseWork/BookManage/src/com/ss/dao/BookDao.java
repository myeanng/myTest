package com.ss.dao;

import java.util.List;

import com.ss.entity.Book;

public interface BookDao {
	int add(Book book);
	int del(int bookid);
	int upd(Book book);
	List<Book> queAll();
	boolean queName(String bookname);
	//��ϲ�ѯ
	List<Book> queBook(String sql);
	Book queISBN(String isbn);
}
