package com.fxt.service;

import com.fxt.entity.District;

public interface DistrictService {
	//根据地区id查询出地区对象
	public District queryDistrictByDid(int did);

}
