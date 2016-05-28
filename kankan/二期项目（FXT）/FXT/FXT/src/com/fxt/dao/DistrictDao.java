package com.fxt.dao;

import com.fxt.entity.District;

public interface DistrictDao {
	//根据地区id查询出地区对象
	public District queryDistrictByDid(int did);

}
