package com.ss.dao.impl;
import org.hibernate.Transaction;
import org.hibernate.Session;

import com.ss.dao.PersonDao;
import com.ss.entity.Person;
import com.ss.factory.HibernateUtil;


public class PersonDaoImpl implements PersonDao {

	Session session =null;
	Transaction tx=null;
	public int add(Person person) {
		// TODO Auto-generated method stub
		session =HibernateUtil.getSession();
		System.out.println("session...");
		tx=session.beginTransaction();
		System.out.println("tx...");
		session.save(person);
		System.out.println("数据添加...");
		tx.commit();
		System.out.println("链接关闭...");
		session.close();
		return 1;
	}

	public int del(int id) {
		// TODO Auto-generated method stub
		session =HibernateUtil.getSession();
		tx=session.beginTransaction();
		Person person=new Person();
		person.setId(1);
		session.delete(person);
		tx.commit();
		session.close();
		System.out.println("删除成功...");
		return 1;
	}

	public Person sel(int id) {
		// TODO Auto-generated method stub
		session =HibernateUtil.getSession();
		tx=session.beginTransaction();
		Person persons=(Person) session.get(Person.class, id);
		tx.commit();
		session.close();
		return persons;
	}

	public int upd(Person person) {
		// TODO Auto-generated method stub
		session =HibernateUtil.getSession();
		tx=session.beginTransaction();
		Person persons=(Person) session.get(Person.class, person.getId());
		System.out.println("查询...");
		persons.setName(person.getName());
		System.out.println("SET数据...");
		tx.commit();
		session.close();
		System.out.println("更新成功...");
		return 1;
	}

}
