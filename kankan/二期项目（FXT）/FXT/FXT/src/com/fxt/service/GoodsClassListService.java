package com.fxt.service;

import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;

public interface GoodsClassListService {
	public GoodsClass queryGoodsClassByGclid(int gclid);
	public GoodsClassList queryGoodsClassListByGclid(int gclid);

}
