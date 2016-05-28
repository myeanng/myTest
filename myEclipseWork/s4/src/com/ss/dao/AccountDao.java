package com.ss.dao;

import java.util.List;

import com.ss.entity.Account;

public interface AccountDao {
	Account find(int id);
	void add(Account account);
	List<Account> find();
	void updateAccount(Account account);
}
