package com.fxt.service.impl;

import java.util.List;

import com.fxt.dao.impl.GoodsDaoImpl;
import com.fxt.entity.Goods;
import com.fxt.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	GoodsDaoImpl goodsdaoimpl=new GoodsDaoImpl();

	public int addgoods(Goods good) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.addgoods(good);
	}

	public List<Goods> selectAll() {
		// TODO Auto-generated method stub
		return goodsdaoimpl.selectAll();
	}

	public int countpage(int size) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.countpage(size);
	}

	public List<Goods> selectPageGoods(int size, int dangqianye) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.selectPageGoods(size, dangqianye);
	}

	public Goods selectGoods(int gid) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.selectGoods(gid);
	}

	public int updategoods(Goods good) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.updategoods(good);
	}

	public int updategoodsisdelete(int gid, int isdelete) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.updategoodsisdelete(gid, isdelete);
	}

	public List<Goods> selectweekgoods() {
		// TODO Auto-generated method stub
		return goodsdaoimpl.selectweekgoods();
	}

	public List<Goods> selecttodaygoods() {
		// TODO Auto-generated method stub
		return goodsdaoimpl.selecttodaygoods();
	}

	public List<Goods> selectlistgoods(int gcid) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.selectlistgoods(gcid);
	}
	public int queryCountPageByGclid(int gclid, int size) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.queryCountPageByGclid(gclid, size);
	}

	public List<Goods> queryGoodsByGclid_Pageindex_size(int gclid,
			int pageindex, int size) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.queryGoodsByGclid_Pageindex_size(gclid, pageindex, size);
	}

	public int queryCountPageByGclid_Did(int gclid, int did, int size) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.queryCountPageByGclid_Did(gclid, did, size);
	}

	public List<Goods> queryGoodsByGclid_Did_Pageindex_size(int gclid, int did,
			int pageindex, int size) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.queryGoodsByGclid_Did_Pageindex_size(gclid, did, pageindex, size);
	}

	public List<Goods> queryGoodsByGclidandDid(int gclid, int did) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Goods> queryGoodsInSS(String sstj) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.queryGoodsInSS(sstj);
	}

	public int updategoodsbysupnum(int num, int gid) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.updategoodsbysupnum(num, gid);
	}

	public int UpGoodSupNum(int uid,int num, int status) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.UpGoodSupNum(uid,num, status);
	}

	public int UpGoodsPic(String pic,int xuan, int gid) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.UpGoodsPic(pic,xuan,gid);
	}

	public List<Goods> sousuoGoods(String gid, String gname, String createtime) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.sousuoGoods(gid, gname, createtime);
	}

	public boolean queryGoodsByGname(String gname) {
		// TODO Auto-generated method stub
		return goodsdaoimpl.queryGoodsByGname(gname);
	}
}
