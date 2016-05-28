package com.fxt.dao;

import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;

public interface GoodsClassListDao {
	//根据小分类的ID查处出该分类所属大分类的信息
	public GoodsClass queryGoodsClassByGclid(int gclid);
	//根据小分类的ID查询出该分类的信息
	public GoodsClassList queryGoodsClassListByGclid(int gclid);
	

}
