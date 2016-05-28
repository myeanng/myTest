package com.ss.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.factory.HibernateSessionFactory;

public class BmDaoImpl {
	Session session=null;
	Transaction tx=null;
	public void add(BM bm) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			session.save(bm);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}

	}
}
