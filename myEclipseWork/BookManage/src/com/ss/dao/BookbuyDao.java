package com.ss.dao;

import java.util.List;

import com.ss.entity.Bookbuy;

public interface BookbuyDao {
	int add(Bookbuy bookbuy);
	//��ϲ�ѯ
	List<Bookbuy> que(String sql);
	
}
