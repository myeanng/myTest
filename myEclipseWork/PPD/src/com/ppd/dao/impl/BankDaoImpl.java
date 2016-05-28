package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.BankDao;
import com.ppd.entity.Bank;
import com.ppd.util.SqlSessionDaoSupportTool;

@Repository("bankDao")
public class BankDaoImpl extends SqlSessionDaoSupportTool implements BankDao {

	public boolean add(Bank entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(BankDao.class).add(entity);
	}

	public boolean del(Bank entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Bank> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Bank queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bank> queryByParam(Bank entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(BankDao.class).queryByParam(entity);
	}

	public boolean up(Bank entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(BankDao.class).up(entity);
	}

	public List<Bank> findBankListByID(int id) {
		return getSqlSession().getMapper(BankDao.class).findBankListByID(id);
	}

}
