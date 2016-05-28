package com.fxt.service;

import java.util.List;

import com.fxt.entity.Goods;
import com.fxt.entity.GoodsOrders;
import com.fxt.entity.Orders;

public interface OrdersService {
	public List<Orders> findOrder(String tablename,String key,int size, int pagenum,int uid);
	public List<Orders> findById(String tablename,String key,int size, int pagenum);
	public int getcount(String tableName, int size,int uid);
	
	//public String getUsernames(String keyword);
	
	public List<Orders> queryOrder(int status);
	public int updateOrder(int oid,int status);
	public Goods price(int gid);
	//添加不需要发货的订单
	public int AddOrders(Orders orders);
	//添加需要发货的订单
	public int AddOrders_fh(Orders orders);
	//根据用户Uid和商品Gid和订单状态信息更新订单状态
	public int updateOrdersbystatus(int uid,int gid,int status);
	
	public List<GoodsOrders> findOrderMessage(int uid,int pagenum,int size);
	public List<GoodsOrders> findOrderStatus(int uid,int status,int pagenum,int size);//������ѯ������״̬//用来查询订单的状态
	public int getcountOrder(String tableName,int size,int uid,int status);
	public int delOrder(int uid,int status,int oid);//删除订单表内的数据
	//查询商品销售情况
	public List<Orders> findMarketing(int tianshu);
	//按月份查询销售量
		public List<Orders> findAmountByMonth(int m);
	// 分页 查询  获取 页数
	public int getPageNum(int size, int status);
	//后台 按照 订单状态 分页查询订单
	public List<Orders> queryOrderByStatusInPage(int status, int pageNum, int size);
	//根据订单ID查询订单
	public Orders queryOrderByOid(int oid);
	//根据用户ID和订单状态查询出最新下的订单的编号
	public int queryOidByUid_status(int uid,int status);
	//
	public List<Orders> queryOrderByCX(String oid, String name, String time,int status);
}
