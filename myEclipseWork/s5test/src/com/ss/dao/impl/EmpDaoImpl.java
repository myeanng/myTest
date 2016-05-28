package com.ss.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.ss.dao.EmpDao;
import com.ss.entity.Emp;

@Repository("ed")
public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao {

	@Autowired
	public void MySetSessionFactory(  SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(emp);
	}

	public List<Emp> findAllEmp() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Emp");
	}

	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(emp);
	}

}
