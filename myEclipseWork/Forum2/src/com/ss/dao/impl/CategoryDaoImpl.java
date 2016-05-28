package com.ss.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.CategoryDao;
import com.ss.entity.Category;
import com.ss.factory.HibernateUtil;

public class CategoryDaoImpl implements CategoryDao {

	Session session =null;
	Transaction tx=null;
	
	public int add(Category category) {
		// TODO Auto-generated method stub
		session =HibernateUtil.getSession();
		tx=session.beginTransaction();
		session.save(category);
		tx.commit();
		session.close();
		return 1;
	}

	public int del(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Category sel(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int upd(Category category) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		System.out.println("hql...");
		List<Category> list=null;
		session =HibernateUtil.getSession();
		tx=session.beginTransaction();
		System.out.println("hql���...");
		String hql="from Category";
		System.out.println("hql��ʼ...");
		list=session.createQuery(hql).list();
		System.out.println("hql����...");
		tx.commit();
		session.close();
		return list;
	}

}