package com.fxt.dao;

public interface PayDao {
	//�����û�uid��ѯ���û������
	public float queryBalanceByUid(int uid);
	//�����û�uid�͸���������û����˻����
	public int updateBalanceByUid_Pay(float pay,int uid);
	
	public int updateBalanceByUid_Pay2(float pay, int uid);
	//�û�ע��ʱ�Զ������û���֧������
	public int insertPayByUid(int uid);
}
