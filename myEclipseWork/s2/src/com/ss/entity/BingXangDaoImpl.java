package com.ss.entity;

import com.ss.dao.BingXangDao;

public class BingXangDaoImpl implements BingXangDao {

	public void goumai(int num) throws Exception {
		// TODO Auto-generated method stub
		if(num>1){
			throw new Exception("限购一台!");
		}
		System.out.println("你购买了一台特价冰箱!");
	}


}
