package com.ss.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.AdminDao;
import com.ss.entity.Admin;
import com.ss.factory.HibernateSessionFactory;

public class AdminDaoImpl implements AdminDao {

	
	Session session=null;
	Transaction tx=null;
	
	public void add(Admin admin) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			session.save(admin);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}

	}

	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			String hql="select a from Admin a where a.name=? and a.pwd=?";
			Query query=session.createQuery(hql);
			query.setParameter(0, admin.getName());
			query.setParameter(1, admin.getPwd());
			admin=(Admin)query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
		
		return admin;
	}

	public void update(Admin admin) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			Admin a=(Admin)session.load(Admin.class, admin.getId());
			a.setLogintime(admin.getLogintime());
			a.setPwd(admin.getPwd());
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
	}

}
