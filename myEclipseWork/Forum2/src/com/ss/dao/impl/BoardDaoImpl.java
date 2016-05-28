package com.ss.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.BoardDao;
import com.ss.entity.Board;
import com.ss.factory.HibernateUtil;

public class BoardDaoImpl implements BoardDao {
	
	Session session =null;
	Transaction tx=null;
	
	public int add(Board board) {
		// TODO Auto-generated method stub
		session =HibernateUtil.getSession();
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
		return null;
	}

	public int upd(Board board) {
		// TODO Auto-generated method stub
		return 0;
	}

}
