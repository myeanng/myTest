package com.forum.dao;

import java.util.List;

import com.forum.entity.Category;

public interface CategoryDao {
	int add(Category category);
	int del(int id);
	int upd(Category category);
	Category sel(int id);
	List<Category> findAll();
	List<Category> find();
}