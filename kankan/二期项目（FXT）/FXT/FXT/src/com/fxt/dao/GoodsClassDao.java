package com.fxt.dao;

import java.util.List;

import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;

public interface GoodsClassDao {
	//根据大分类的ID查询出该分类的信息
	public GoodsClass queryGoodsClassByGcid(int gcid);
	//根据大分类的ID查询出其下小分类的信息
	public List<GoodsClassList> queryGoodsClassListByGcid(int gcid);
}