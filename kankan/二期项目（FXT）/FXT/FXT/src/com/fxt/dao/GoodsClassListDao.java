package com.fxt.dao;

import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;

public interface GoodsClassListDao {
	//����С�����ID�鴦���÷���������������Ϣ
	public GoodsClass queryGoodsClassByGclid(int gclid);
	//����С�����ID��ѯ���÷������Ϣ
	public GoodsClassList queryGoodsClassListByGclid(int gclid);
	

}
