package com.ss.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.MessageDao;
import com.ss.entity.Message;
import com.ss.factory.HibernateSessionFactory;

public class MessageDaoImpl implements MessageDao {
	
	Session session=null;
	Transaction tx=null;

	public void add(Message message) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			session.save(message);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}

	}

	public Message find(int id) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Message message=null;
		
		try {
			message=(Message)session.load(Message.class, id);
			message.getType().getName();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
		return message;
	}

	public List<Message> find(String hql) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		List<Message> list=new ArrayList<Message>();
		
		try {
			list=session.createQuery(hql).list();
			for (Message message : list) {
				message.getType().getName();
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
