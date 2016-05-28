package com.fxt.service;

import java.util.List;

import com.fxt.entity.Goods;

public interface GoodsService {

	public int addgoods(Goods good);
	public List<Goods> selectAll();
	public int countpage(int size);
	public List<Goods> selectPageGoods(int size,int dangqianye);
	public Goods selectGoods(int gid);
	public int updategoods(Goods good);
	public int updategoodsisdelete(int gid,int isdelete);
	public List<Goods> selectweekgoods();
	public List<Goods> selecttodaygoods();
	public List<Goods> selectlistgoods(int gcid);
	public List<Goods> queryGoodsByGclidandDid(int gclid,int did);
	//根据小分类gclid和每页显示条数size，查询出属于小分类的商品共多少页
	public int queryCountPageByGclid(int gclid,int size);
	//根据小分类gclid和查询的页数pageindex和每页显示的条数size查询商品
	public List<Goods> queryGoodsByGclid_Pageindex_size(int gclid,int pageindex,int size);
	//根据区域分类did和小分类gclid和每页显示条数size，查询出所属商品共多少页
	public int queryCountPageByGclid_Did(int gclid,int did,int size);
	//根据区域分类did和小分类gclid和查询的页数pageindex和每页显示的条数size查询商品
	public List<Goods> queryGoodsByGclid_Did_Pageindex_size(int gclid,int did,int pageindex,int size);
	//首页“搜索”按钮查询方法
	public List<Goods> queryGoodsInSS(String sstj);
	//根据商品Gid更新商品的库存
	public int updategoodsbysupnum(int num,int gid);
	
	public int UpGoodSupNum(int uid,int num, int status);
	
	//更新图片
	public int UpGoodsPic(String pic,int xuan,int gid);
	//后台搜索商品
	public List<Goods> sousuoGoods(String gid,String gname,String createtime);
	//后台发布商品时查询商品名称是否重复
	public boolean queryGoodsByGname(String gname);
}
