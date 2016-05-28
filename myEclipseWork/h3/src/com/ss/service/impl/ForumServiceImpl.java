package com.ss.service.impl;

import java.util.List;

import com.ss.dao.BoardDao;
import com.ss.dao.CategoryDao;
import com.ss.dao.PersonDao;
import com.ss.dao.impl.BoardDaoImpl;
import com.ss.dao.impl.CategoryDaoImpl;
import com.ss.dao.impl.PersonDaoImpl;
import com.ss.entity.Board;
import com.ss.entity.Category;
import com.ss.entity.Person;
import com.ss.service.ForumService;

public class ForumServiceImpl implements ForumService {
	
	PersonDao pd=new PersonDaoImpl();
	CategoryDao cd=new CategoryDaoImpl();
	BoardDao bd=new BoardDaoImpl();
	
	public int addBoard(Board board) {
		// TODO Auto-generated method stub
		return bd.add(board);
	}

	public int addCategory(Category category) {
		// TODO Auto-generated method stub
		return cd.add(category);
	}

	public int addPerson(Person person) {
		// TODO Auto-generated method stub
		return pd.add(person);
	}

	public List<Person> findPerson() {
		// TODO Auto-generated method stub
		return pd.findAll();
	}

	public Board findBoard(int id) {
		// TODO Auto-generated method stub
		return bd.sel(id);
	}

	public List<Board> findBoard() {
		// TODO Auto-generated method stub
		return bd.findAll();
	}

	public Category findCategory(int id) {
		// TODO Auto-generated method stub
		return cd.sel(id);
	}

	public List<Category> findCategory() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}

	public Person findPerson(int id) {
		// TODO Auto-generated method stub
		return pd.sel(id);
	}

	public int upBoard(Board board) {
		// TODO Auto-generated method stub
		return bd.upd(board);
	}

	public int upCategory(Category category) {
		// TODO Auto-generated method stub
		return cd.upd(category);
	}

	public int upPerson(Person person) {
		// TODO Auto-generated method stub
		return pd.upd(person);
	}

	public int delBoard(int id) {
		// TODO Auto-generated method stub
		return bd.del(id);
	}

	public int delCategory(int id) {
		// TODO Auto-generated method stub
		return cd.del(id);
	}

	public int delPerson(int id) {
		// TODO Auto-generated method stub
		return pd.del(id);
	}

	public Person findPerson(Person person) {
		// TODO Auto-generated method stub
		return pd.sel(person);
	}

	public List<Board> findAllBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return cd.find();
	}

}
