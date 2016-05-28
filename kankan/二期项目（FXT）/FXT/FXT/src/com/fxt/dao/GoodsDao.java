package com.fxt.dao;

import java.util.List;

import com.fxt.entity.Goods;

public interface GoodsDao {
	//后台发布商品
	public int addgoods(Goods good);
	//后台查看所有商品
	public List<Goods> selectAll();
	//后台根据每页显示商品的条数size获取总页数
	public int countpage(int size);
	//后台根据每页显示商品的条数和查看的页数显示商品
	public List<Goods> selectPageGoods(int size,int dangqianye);
	//根据商品Gid查询商品
	public Goods selectGoods(int gid);
	//后台更新商品信息
	public int updategoods(Goods good);
	//后台根据商品Gid更改商品上下架信息
	public int updategoodsisdelete(int gid,int isdelete);
	//后台更新商品图片信息——未完成
	public int updategoodspic(String pic1,String pic2,String pic3);
	//首页查询本周最新发布商品
	public List<Goods> selectweekgoods();
	//首页查询今天最新发布商品
	public List<Goods> selecttodaygoods();
	//首页根据大分类Gcid查询最新发布商品
	public List<Goods> selectlistgoods(int gcid);
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
	
	//后台更新库存的数量
	public int UpGoodSupNum(int uid,int num,int status);
	//后台更新图片
	public int UpGoodsPic(String pic,int xuan,int gid);
	//后台搜索商品
	public List<Goods> sousuoGoods(String gid,String gname,String createtime);
	//后台发布商品时查询商品名称是否重复
	public boolean queryGoodsByGname(String gname);
}
