package com.forum.dao.impl;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.Session;

import com.forum.dao.PersonDao;
import com.forum.entity.Person;
import com.forum.util.HibernateSessionFactory;


public class PersonDaoImpl implements PersonDao {

	Session session =null;
	Transaction tx=null;
	public int add(Person person) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		session.save(person);
		tx.commit();
		session.close();
		return 1;
	}

	public int del(int id) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Person person=new Person();
		person.setId(1);
		session.delete(person);
		tx.commit();
		session.close();
		return 1;
	}

	public Person sel(int id) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Person persons=(Person) session.get(Person.class, id);
		tx.commit();
		session.close();
		return persons;
	}

	public int upd(Person person) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Person persons=(Person) session.get(Person.class, person.getId());
		persons.setName(person.getName());
		tx.commit();
		session.close();
		return 1;
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		List<Person> list=null;
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		String hql="from Person";
		list=session.createQuery(hql).list();
		tx.commit();
		session.close();
		return list;
	}

	public Person sel(Person person) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		String hql="select p from Person p where p.account=? and p.password=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, person.getAccount());
		query.setParameter(1, person.getPassword());
		Person p=(Person)query.uniqueResult();
		tx.commit();
		session.close();
		return p;
	}

}
