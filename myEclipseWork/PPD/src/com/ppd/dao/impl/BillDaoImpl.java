package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.BillDao;
import com.ppd.entity.Bill;
import com.ppd.util.SqlSessionDaoSupportTool;

@Repository("billDao")
public class BillDaoImpl extends SqlSessionDaoSupportTool implements BillDao {

	public boolean add(Bill entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(BillDao.class).add(entity);
	}

	public boolean del(Bill entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Bill> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Bill queryById(Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(BillDao.class).queryById(id);
	}

	public List<Bill> queryByParam(Bill entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(BillDao.class).queryByParam(entity);
	}

	public boolean up(Bill entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
