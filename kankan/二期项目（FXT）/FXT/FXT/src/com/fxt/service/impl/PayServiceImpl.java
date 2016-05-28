package com.fxt.service.impl;

import com.fxt.dao.impl.PayDaoImpl;
import com.fxt.service.PayService;

public class PayServiceImpl implements PayService {
	PayDaoImpl pdi=new PayDaoImpl();
	public float queryBalanceByUid(int uid) {
		// TODO Auto-generated method stub
		return pdi.queryBalanceByUid(uid);
	}
	public int updateBalanceByUid_Pay(float pay, int uid) {
		// TODO Auto-generated method stub
		return pdi.updateBalanceByUid_Pay(pay, uid);
	}
	public int updateBalanceByUid_Pay2(float pay, int uid) {
		// TODO Auto-generated method stub
		return pdi.updateBalanceByUid_Pay2(pay, uid);
	}
	public int insertPayByUid(int uid) {
		// TODO Auto-generated method stub
		return pdi.insertPayByUid(uid);
	}

}
