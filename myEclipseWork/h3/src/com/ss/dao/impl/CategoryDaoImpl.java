package com.ss.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.CategoryDao;
import com.ss.entity.Board;
import com.ss.entity.Category;
import com.ss.factory.HibernateSessionFactory;

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
		for(int i=0;i<list.size();i++){
			Set<Board> boards=list.get(i).getBoards();
			for(Board b:boards){
				
				System.out.println(b.getName());
				
				System.out.println(b.getPersons());
			}
			
		}
		tx.commit();
		session.close();
		return list;
	}

}
