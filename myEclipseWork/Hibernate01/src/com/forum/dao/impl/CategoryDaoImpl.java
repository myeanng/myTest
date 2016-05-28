package com.forum.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.forum.dao.CategoryDao;
import com.forum.entity.Category;
import com.forum.util.HibernateSessionFactory;

public class CategoryDaoImpl implements CategoryDao {

	Session session =null;
	Transaction tx=null;
	
	public int add(Category category) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		session.save(category);
		tx.commit();
		session.close();
		System.out.println("添加类别成功...");
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
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Category categoryr=(Category) session.get(Category.class, category.getId());
		categoryr.setName(category.getName());
		tx.commit();
		session.close();
		return 1;
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		List<Category> list=null;
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		String hql="from Category";
		list=session.createQuery(hql).list();
		tx.commit();
		session.close();
		return list;
	}

	public List<Category> find() {
		// TODO Auto-generated method stub
		List<Category> list=null;
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		String hql="select c from Category c inner join fetch c.boards";
		list=session.createQuery(hql).list();
		tx.commit();
		session.close();
		return list;
	}

}
