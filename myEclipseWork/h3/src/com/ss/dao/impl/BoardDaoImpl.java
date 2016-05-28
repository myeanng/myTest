package com.ss.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.BoardDao;
import com.ss.entity.Board;
import com.ss.factory.HibernateSessionFactory;

public class BoardDaoImpl implements BoardDao {
	
	Session session =null;
	Transaction tx=null;
	
	public int add(Board board) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		session.save(board);
		tx.commit();
		session.close();
		return 1;
	}

	public int del(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Board sel(int id) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Board board=(Board) session.get(Board.class, id);
		tx.commit();
		session.close();
		return board;
	}

	public int upd(Board board) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Board boardr=(Board) session.get(Board.class, board.getId());
		boardr.setPersons(board.getPersons());
		tx.commit();
		session.close();
		return 1;
	}

	public List<Board> findAll() {
		// TODO Auto-generated method stub
		List<Board> list=null;
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		String hql="from Board";
		list=session.createQuery(hql).list();
		tx.commit();
		session.close();
		return list;
	}

}
