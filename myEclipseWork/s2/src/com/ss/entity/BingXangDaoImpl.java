package com.ss.entity;

import com.ss.dao.BingXangDao;

public class BingXangDaoImpl implements BingXangDao {

	public void goumai(int num) throws Exception {
		// TODO Auto-generated method stub
		if(num>1){
			throw new Exception("�޹�һ̨!");
		}
		System.out.println("�㹺����һ̨�ؼ۱���!");
	}


}
