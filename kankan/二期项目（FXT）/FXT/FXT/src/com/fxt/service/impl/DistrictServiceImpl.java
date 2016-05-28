package com.fxt.service.impl;

import com.fxt.dao.impl.DistrictDaoImpl;
import com.fxt.entity.District;
import com.fxt.service.DistrictService;

public class DistrictServiceImpl implements DistrictService {
	DistrictDaoImpl ddi=new DistrictDaoImpl();

	public District queryDistrictByDid(int did) {
		// TODO Auto-generated method stub
		return ddi.queryDistrictByDid(did);
	}

}
