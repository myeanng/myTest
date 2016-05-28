package com.ss.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.CxDao;
import com.ss.factory.HibernateSessionFactory;

public class HCxDaoImpl implements CxDao {
	
	Session session=null;
	Transaction tx=null;
	
	public List<BM> findAll() {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		List<BM> list=new ArrayList<BM>();
		String hql="from BM";
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

}
