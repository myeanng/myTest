package com.ss.dao;

import java.util.List;

import com.ss.entity.Booksale;

public interface BooksaleDao {
	int add(Booksale booksale);
	//×éºÏ²éÑ¯
	List<Booksale> que(String sql);
}
