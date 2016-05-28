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

	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(id);
	}

	public List<Emp> findAllEmp() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Emp");
	}

	public List<Emp> findAllEmpByPage(int page, int size) {
		// TODO Auto-generated method stub
		org.hibernate.Session session = this.getSession();
		List<Emp>  list = session.createQuery("from Emp").setFirstResult((page-1)*size ).setMaxResults(size).list();
		
		this.releaseSession(session);
		
		return list;
	}

	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(emp);

	}

}
