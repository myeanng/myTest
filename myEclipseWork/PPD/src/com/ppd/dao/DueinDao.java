package com.ppd.dao;

import java.util.HashMap;

import com.ppd.entity.Duein;

public interface DueinDao extends BaseDao<Duein> {
	Double ljmoney(int id);
	Double dsmoney(int id);
	Double syl(int id);
	Integer dueinNum(HashMap<String,Integer> map);
}
