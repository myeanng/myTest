package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.LoanDao;
import com.ppd.entity.Loan;
import com.ppd.util.SqlSessionDaoSupportTool;


@Repository("loanDao")
public class LoanDaoImpl extends SqlSessionDaoSupportTool implements LoanDao {

	public boolean add(Loan entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Loan entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Loan> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Loan queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Loan> queryByParam(Loan entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(LoanDao.class).queryByParam(entity);
	}

	public boolean up(Loan entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public double findLoanmoney(int id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(LoanDao.class).findLoanmoney(id);
	}

}
