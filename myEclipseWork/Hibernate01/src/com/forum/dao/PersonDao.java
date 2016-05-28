package com.forum.dao;

import java.util.List;

import com.forum.entity.Person;

public interface PersonDao {
	int add(Person person);
	int del(int id);
	int upd(Person person);
	Person sel(int id);
	List<Person> findAll();
	Person sel(Person person);
}
