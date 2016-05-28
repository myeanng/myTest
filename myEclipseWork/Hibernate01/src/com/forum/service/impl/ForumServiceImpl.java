package com.forum.service.impl;

import java.util.List;

import com.forum.dao.BoardDao;
import com.forum.dao.CategoryDao;
import com.forum.dao.PersonDao;
import com.forum.dao.impl.BoardDaoImpl;
import com.forum.dao.impl.CategoryDaoImpl;
import com.forum.dao.impl.PersonDaoImpl;
import com.forum.service.ForumService;
import com.forum.entity.Board;
import com.forum.entity.Category;
import com.forum.entity.Person;

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
