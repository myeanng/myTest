package com.ss.dao;

import java.util.List;

import com.ss.entity.Person;

public interface PersonDao {
	int add(Person person);
	int del(int id);
	int upd(Person person);
	Person sel(int id);
	List<Person> findAll();
	Person sel(Person person);
}
