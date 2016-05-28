package com.ss.dao;

import java.util.List;

import com.ss.entity.Type;

public interface TypeDao{
	List<Type> findAll();
	List<Type> find();
	void add(Type type);
}
