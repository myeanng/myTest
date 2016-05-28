package com.ppd.dao;

import java.util.List;

import com.ppd.entity.Bank;

public interface BankDao extends BaseDao<Bank> {
	//根据用户Id查询所有绑定过的银行卡
	List<Bank> findBankListByID(int id);
}
