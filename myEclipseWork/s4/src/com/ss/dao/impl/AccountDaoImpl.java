package com.ss.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ss.dao.AccountDao;
import com.ss.entity.Account;

public class AccountDaoImpl extends HibernateTemplate implements AccountDao {

	public void add(Account account) {
		// TODO Auto-generated method stub
		save(account);
	}

	public List<Account> find() {
		// TODO Auto-generated method stub
		return find("from Account");
	}

	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		update(account);
	}

	public Account find(int id) {
		// TODO Auto-generated method stub
		return get(Account.class, id);
	}

}
