package com.ss.dao;

import java.util.List;

import com.ss.entity.Category;

public interface CategoryDao {
	int add(Category category);
	int del(int categoryid);
	int upd(Category category);
	List<Category> queAll();
	boolean queName(String categoryname);
}
