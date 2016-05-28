package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.UserinfoDao;
import com.ppd.entity.Userinfo;
import com.ppd.util.SqlSessionDaoSupportTool;
@Repository("userinfoDao")
public class UserinfoDaoImpl extends SqlSessionDaoSupportTool implements
		UserinfoDao {

	public boolean add(Userinfo entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Userinfo entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Userinfo> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Userinfo queryById(Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(UserinfoDao.class).queryById(id);
	}

	public List<Userinfo> queryByParam(Userinfo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean up(Userinfo entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(UserinfoDao.class).up(entity);
	}

}
