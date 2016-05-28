package com.fxt.service.impl;

import java.util.List;

import com.fxt.dao.OrdersDao;
import com.fxt.dao.impl.OrdersDaoImpl;
import com.fxt.entity.Goods;
import com.fxt.entity.GoodsOrders;
import com.fxt.entity.Orders;
import com.fxt.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {
    OrdersDao dao=new OrdersDaoImpl();

	public List<Orders> findOrder(String tablename,String key,int size, int pagenum,int uid) {
		// TODO Auto-generated method stub
		return dao.findOrder(tablename,key,size, pagenum,uid);
	}
	public int getcount(String tableName, int size,int uid) {
		// TODO Auto-generated method stub
		return dao.getcount(tableName, size,uid);
	}
	public List<Orders> findById(String tablename, String key, int size,
			int pagenum) {
		// TODO Auto-generated method stub
		return dao.findById(tablename, key, pagenum, size);
	}
	public List<Orders> queryOrder(int status) {
		// TODO Auto-generated method stub
		return dao.queryOrder(status);
	}
	public int updateOrder(int oid, int status) {
		// TODO Auto-generated method stub
		return dao.updateOrder(oid, status);
	}
	public Goods price(int gid) {
		// TODO Auto-generated method stub
		return dao.price(gid);
	}
	public int AddOrders(Orders orders) {
		// TODO Auto-generated method stub
		return dao.AddOrders(orders);
	}
	public int AddOrders_fh(Orders orders) {
		// TODO Auto-generated method stub
		return dao.AddOrders_fh(orders);
	}
	public int updateOrdersbystatus(int uid, int gid, int status) {
		// TODO Auto-generated method stub
		return dao.updateOrdersbystatus(uid, gid, status);
	}
	
	
	public int delOrder(int uid, int status, int oid) {
		// TODO Auto-generated method stub
		return dao.delOrder(uid, status, oid);
	}
	public List<GoodsOrders> findOrderMessage(int uid, int pagenum, int size) {
		// TODO Auto-generated method stub
		return dao.findOrderMessage(uid, pagenum, size);
	}
	public List<GoodsOrders> findOrderStatus(int uid, int status, int pagenum,
			int size) {
		// TODO Auto-generated method stub
		return dao.findOrderStatus(uid, status, pagenum, size);
	}
	public int getcountOrder(String tableName, int size, int uid, int status) {
		// TODO Auto-generated method stub
		return dao.getcountOrder(tableName, size, uid, status);
	}
	public List<Orders> findMarketing(int tianshu) {
		// TODO Auto-generated method stub
		return dao.findMarketing(tianshu);
	}
	public int getPageNum(int size, int status) {
		// TODO Auto-generated method stub
		return dao.getPageNum(size, status);
	}
	public List<Orders> queryOrderByStatusInPage(int status, int pageNum,
			int size) {
		// TODO Auto-generated method stub
		return dao.queryOrderByStatusInPage(status, pageNum, size);
	}
	public Orders queryOrderByOid(int oid) {
		// TODO Auto-generated method stub
		return dao.queryOrderByOid(oid);
	}
	public int queryOidByUid_status(int uid, int status) {
		// TODO Auto-generated method stub
		return dao.queryOidByUid_status(uid, status);
	}
	public List<Orders> queryOrderByCX(String oid, String name, String time,int status) {
		// TODO Auto-generated method stub
		return dao.queryOrderByCX(oid, name, time, status);
	}
	public List<Orders> findAmountByMonth(int m) {
		// TODO Auto-generated method stub
		return dao.findAmountByMonth(m);
	}
	
}
