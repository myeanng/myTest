package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.CreditDao;
import com.ppd.entity.Credit;
import com.ppd.util.SqlSessionDaoSupportTool;


@Repository("creditDao")
public class CreditDaoImpl extends SqlSessionDaoSupportTool implements
		CreditDao {

	public boolean add(Credit entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Credit entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Credit> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Credit queryById(Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(CreditDao.class).queryById(id);
	}

	public List<Credit> queryByParam(Credit entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean up(Credit entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
