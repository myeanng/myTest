package com.ss.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.VoterDao;
import com.ss.entity.Voter;
import com.ss.factory.HibernateSessionFactory;

public class VoterDaoImpl implements VoterDao {

	Session session=null;
	Transaction tx=null;
	
	public void add(Voter voter) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			session.save(voter);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
	}

}
