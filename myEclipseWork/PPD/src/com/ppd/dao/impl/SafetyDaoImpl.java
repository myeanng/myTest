package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.SafetyDao;
import com.ppd.entity.Safety;
import com.ppd.util.SqlSessionDaoSupportTool;

@Repository("safetyDao")
public class SafetyDaoImpl extends SqlSessionDaoSupportTool implements
		SafetyDao {

	public boolean add(Safety entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Safety entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Safety> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Safety queryById(Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(SafetyDao.class).queryById(id);
	}

	public List<Safety> queryByParam(Safety entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean up(Safety entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(SafetyDao.class).up(entity);
	}

}
