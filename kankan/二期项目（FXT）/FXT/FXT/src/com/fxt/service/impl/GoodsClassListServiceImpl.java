package com.fxt.service.impl;

import com.fxt.dao.impl.GoodsClassListDaoImpl;
import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;
import com.fxt.service.GoodsClassListService;

public class GoodsClassListServiceImpl implements GoodsClassListService {
 
	GoodsClassListDaoImpl gcldi=new GoodsClassListDaoImpl();
	public GoodsClassList queryGoodsClassListByGclid(int gclid) {
		// TODO Auto-generated method stub
		return gcldi.queryGoodsClassListByGclid(gclid);
	}
	public GoodsClass queryGoodsClassByGclid(int gclid) {
		// TODO Auto-generated method stub
		return gcldi.queryGoodsClassByGclid(gclid);
	}

}
