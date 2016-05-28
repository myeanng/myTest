package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.AccountDao;
import com.ppd.entity.Account;
import com.ppd.util.SqlSessionDaoSupportTool;


@Repository("accountDao")
public class AccountDaoImpl extends SqlSessionDaoSupportTool implements
		AccountDao {

	public boolean add(Account entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Account entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Account> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Account queryById(Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(AccountDao.class).queryById(id);
	}

	public List<Account> queryByParam(Account entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean up(Account entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(AccountDao.class).up(entity);
	}

}
