package com.ss.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.VotecontextDao;
import com.ss.entity.Votecontext;
import com.ss.factory.HibernateSessionFactory;

public class VotecontextDaoImpl implements VotecontextDao {

	Session session=null;
	Transaction tx=null;
	
	public void add(Votecontext votecontext) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			session.save(votecontext);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
	}

	public List<Votecontext> find() {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		List<Votecontext> list=new ArrayList<Votecontext>();
		String hql="from Votecontext";
		
		try {
			list=session.createQuery(hql).list();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
	}

	public void update(Votecontext votecontext) {
		// TODO Auto-generated method stub

	}

}
