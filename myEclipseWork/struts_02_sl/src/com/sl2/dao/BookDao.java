package com.sl2.dao;

import java.util.List;

import com.sl2.entity.Book;

public interface BookDao {
List<Book> findAll();
List<Book> findName(String colName,String keyWords);
}
