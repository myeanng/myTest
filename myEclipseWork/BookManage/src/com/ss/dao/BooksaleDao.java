package com.ss.dao;

import java.util.List;

import com.ss.entity.Booksale;

public interface BooksaleDao {
	int add(Booksale booksale);
	//��ϲ�ѯ
	List<Booksale> que(String sql);
}
