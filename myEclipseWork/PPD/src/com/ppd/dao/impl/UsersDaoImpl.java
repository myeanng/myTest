package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.UsersDao;
import com.ppd.entity.Users;
import com.ppd.util.SqlSessionDaoSupportTool;

@Repository("usersDao")
public class UsersDaoImpl extends SqlSessionDaoSupportTool  implements UsersDao {

	public boolean add(Users entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Users entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Users> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Users queryById(Integer id) {
		// TODO Auto-generated method stub
		return (Users)getSqlSession().getMapper(UsersDao.class).queryById(id);
	}

	public List<Users> queryByParam(Users entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean up(Users entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(UsersDao.class).up(entity);
	}

	public Users findUsers(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Users findUsersIdentification(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public Users findUserLoanAccount(int id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(UsersDao.class).findUserLoanAccount(id);
	}

	public Users findUserDueinAccount(int id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(UsersDao.class).findUserDueinAccount(id);
	}

	public Users findUserAndUserinfo(int userid) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(UsersDao.class).findUserAndUserinfo(userid);
	}

}
