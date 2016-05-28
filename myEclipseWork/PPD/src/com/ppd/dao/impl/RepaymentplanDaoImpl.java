package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.RepaymentplanDao;
import com.ppd.entity.Repaymentplan;
import com.ppd.util.SqlSessionDaoSupportTool;

@Repository("repaymentplanDao")
public class RepaymentplanDaoImpl extends SqlSessionDaoSupportTool implements
		RepaymentplanDao {

	public boolean add(Repaymentplan entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Repaymentplan entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Repaymentplan> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Repaymentplan queryById(Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(RepaymentplanDao.class).queryById(id);
	}

	public List<Repaymentplan> queryByParam(Repaymentplan entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean up(Repaymentplan entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
