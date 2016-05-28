package com.fxt.dao;

public interface PayDao {
	//根据用户uid查询出用户的余额
	public float queryBalanceByUid(int uid);
	//根据用户uid和付款金额更新用户的账户余额
	public int updateBalanceByUid_Pay(float pay,int uid);
	
	public int updateBalanceByUid_Pay2(float pay, int uid);
	//用户注册时自动开辟用户的支付中心
	public int insertPayByUid(int uid);
}
