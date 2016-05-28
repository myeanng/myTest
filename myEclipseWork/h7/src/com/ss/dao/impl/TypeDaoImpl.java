package com.ss.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.TypeDao;
import com.ss.entity.Type;
import com.ss.factory.HibernateSessionFactory;

public class TypeDaoImpl implements TypeDao {

	Session session=null;
	Transaction tx=null;
	
	public void add(Type type) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			session.save(type);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
	}

	public List<Type> find() {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		List<Type> list=new ArrayList<Type>();
		String hql="from Type";
		
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

	public List<Type> findAll() {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		List<Type> list=new ArrayList<Type>();
		String hql="from Type";
		
		try {
			
			list=session.createQuery(hql).list();
			for (Type type : list) {
				type.getMessages().size();
			}
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
