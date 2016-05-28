package com.ppd.dao;

import com.ppd.entity.Loan;

public interface LoanDao extends BaseDao<Loan> {
	double findLoanmoney(int id);
}
