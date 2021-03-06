package com.ss.service;

import java.util.List;

import com.ss.entity.Board;
import com.ss.entity.Category;
import com.ss.entity.Person;

public interface ForumService {
	int addPerson(Person person);
	int addCategory(Category category);
	int addBoard(Board board);
	
	int upPerson(Person person);
	int upCategory(Category category);
	int upBoard(Board board);
	
	int delPerson(int id);
	int delCategory(int id);
	int delBoard(int id);
	
	Person findPerson(int id);
	Category findCategory(int id);
	Board findBoard(int id);
	
	List<Person> findPerson();
	List<Category> findCategory();
	List<Board> findBoard();
	//��½
	Person findPerson(Person person);
	//������ѯ
	List<Category> findAllCategory();
	List<Board> findAllBoard();
	
}
