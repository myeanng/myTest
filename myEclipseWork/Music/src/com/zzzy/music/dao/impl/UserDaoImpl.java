package com.zzzy.music.dao.impl;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zzzy.music.dao.UserDao;
import com.zzzy.music.entity.User;
@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	//×¢Èësession¹¤³§
	@Autowired
	public void MySetSessionFactory(  SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub

	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from User");
	}

	public List<User> findAllUserByPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUser(int id) {
		// TODO Auto-generated method stub
		Session session = super.getSession();
		User user=(User)session.get(User.class, id);
		user.getMusics().size();
		super.releaseSession(session);
		return user;
	}

	public User findUser(String name, String pwd) {
		// TODO Auto-generated method stub
		User user=(User)this.getHibernateTemplate().find("from User where name=? and pwd=?", name,pwd).get(0);
		return user;
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	public User findUser(String name) {
		// TODO Auto-generated method stub
		User user=(User)this.getHibernateTemplate().find("from User where name=?", name).get(0);
		return user;
	}

}
