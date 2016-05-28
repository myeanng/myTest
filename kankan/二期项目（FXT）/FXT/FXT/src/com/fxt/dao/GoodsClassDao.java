package com.fxt.dao;

import java.util.List;

import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;

public interface GoodsClassDao {
	//���ݴ�����ID��ѯ���÷������Ϣ
	public GoodsClass queryGoodsClassByGcid(int gcid);
	//���ݴ�����ID��ѯ������С�������Ϣ
	public List<GoodsClassList> queryGoodsClassListByGcid(int gcid);
}