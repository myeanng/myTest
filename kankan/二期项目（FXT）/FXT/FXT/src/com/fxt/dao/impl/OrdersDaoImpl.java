package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fxt.dao.OrdersDao;
import com.fxt.entity.Goods;
import com.fxt.entity.GoodsOrders;
import com.fxt.entity.Orders;
import com.fxt.util.BaseDao;

public class OrdersDaoImpl implements OrdersDao {
      BaseDao bd=new BaseDao("FXT");
	public List<Orders> findOrder(String tablename,String key,int size, int pagenum,int uid) {
		// TODO Auto-generated method stub
		List<Orders> list=new ArrayList<Orders>();
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			String sql="select top("+size+") *from Orders where uid=? and "+key+"  not in(select top("+(pagenum-1)*size+") oid from Orders) order by "+key+"";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, uid);
			rs=pstmt.executeQuery();
			while(rs.next()){
			Orders o=new Orders(rs.getInt("oid"),rs.getInt("uid"),rs.getInt("num"),rs.getFloat("totalprice"),rs.getString("createtime"),rs.getString("uname"),rs.getString("address"),rs.getString("tel"),rs.getInt("status"),rs.getInt("isdelete"),rs.getString("beizhu"));
			list.add(o);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, conn);
		}
		return list;
	}
	public List<Orders> findById(String tablename,String key,int pagenum,int size){
		// TODO Auto-generated method stub
		List<Orders> list=new ArrayList<Orders>();
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select top("+size+") *from Orders where "+key+" not in(select top("+(pagenum-1)*size+") oid from Orders) and status=1 order by "+key+"";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
		Orders o=new Orders(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getFloat(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),rs.getInt(10),rs.getString(11));
			list.add(o);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, conn);
		}
		return list;
	}
	//分页查询
	public int getcount(String tableName, int size,int uid) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=0;
		try {
			String sql="select count(oid) from "+tableName+" where uid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, uid);
			rs=pstmt.executeQuery();
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return count%size==0?count/size:(count/size+1);
	}
	//自动补全
	public List<String> queryUsernameByKeyword(String keyword) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<String> names=new ArrayList<String>();
		
		try {
			String sql="select username from Users where username like '"+keyword+"%'";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				String name=rs.getString(1);
				names.add(name);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		
		return names;
	}
	public List<Orders> queryOrder(int status) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Orders> list=new ArrayList<Orders>();
		String sql="select * from Orders where status="+status+" and isdelete=0";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Orders order=new Orders(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getFloat(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10));
				list.add(order);
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, conn);
		}
		return list;
	}
	public int updateOrder(int oid, int status) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		int rows=0;
		String sql="update Orders set status=? where oid=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, status);
			pstmt.setInt(2, oid);
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, conn);
		}
		return rows;
	}
	public Goods price(int gid) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		int goodsid=0;
		String gname=null;
		float price=0;
		ResultSet rs=null;
		Goods goods=null;
		String sql="select * from goods where gid="+gid+"";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				goods=new Goods(rs.getInt("gid"),rs.getString("gname"),rs.getFloat("price"));
				goodsid=rs.getInt("gid");
				gname=rs.getString("gname");
				price=rs.getFloat("price");
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return goods;
	}
	public int AddOrders(Orders orders) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		int rows=0;
		String sql="insert into orders(uid,gid,num,totalprice) values(?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, orders.getUid());
			pstmt.setInt(2, orders.getGid());
			pstmt.setInt(3, orders.getNum());
			pstmt.setFloat(4, orders.getTotalprice());
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, conn);
		}
		return rows;
	}
	public int AddOrders_fh(Orders orders) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		int rows=0;
		String sql="insert into orders(uid,gid,num,totalprice,uname,address,tel) values(?,?,?,?,?,?,?)";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, orders.getUid());
			pstmt.setInt(2, orders.getGid());
			pstmt.setInt(3, orders.getNum());
			pstmt.setFloat(4, orders.getTotalprice());
			pstmt.setString(5, orders.getUname());
			pstmt.setString(6, orders.getAddress());
			pstmt.setString(7, orders.getTel());
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, conn);
		}
		return rows;
	}
	public int updateOrdersbystatus(int uid, int gid, int status) {
		// TODO Auto-generated method stub
		int row=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="update orders set status=? where uid=? and gid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, status);
			pstmt.setInt(2, uid);
			pstmt.setInt(3, gid);
			row=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return row;
	}
	
	
	public int delOrder(int uid, int status, int oid) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		int row=0;
		String sql="delete orders where orders.uid=? and orders.status=? and orders.oid=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, uid);
			pstmt.setInt(2, status);
			pstmt.setInt(3,oid);
			row=pstmt.executeUpdate();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, conn);
		}
		return row;
	}
	public List<GoodsOrders> findOrderMessage(int uid,int size,int pagenum) {
		// TODO Auto-generated method stub
		List<GoodsOrders> list=new ArrayList<GoodsOrders>();
		Connection conn=bd.getConn();
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		String sql="select top ("+size+") gname,pic1,destroytime,orders.num,orders.totalprice,orders.status,orders.oid from goods,orders where orders.oid not in (select top ("+size*(pagenum-1)+") orders.oid from goods,orders where  goods.gid=orders.gid and orders.uid="+uid+") and goods.gid=orders.gid and orders.uid="+uid+" ";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				GoodsOrders g=new GoodsOrders(rs.getString("gname"),rs.getString("pic1"),rs.getString("destroytime"),rs.getInt("num"),rs.getFloat("totalprice"),rs.getInt("status"),rs.getInt("oid"));
				list.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, conn);
		}
		return list;
	}
	public List<GoodsOrders> findOrderStatus(int uid, int status,int size,int pagenum) {
		// TODO Auto-generated method stub
		List<GoodsOrders> list=null;
		Connection conn=bd.getConn();
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		String sql="select top ("+size+") gname,pic1,destroytime,orders.num,orders.totalprice,orders.status,orders.oid from goods,orders where orders.oid not in (select top ("+size*(pagenum-1)+") orders.oid from goods,orders where  goods.gid=orders.gid and orders.uid="+uid+" and orders.status="+status+") and goods.gid=orders.gid and orders.uid="+uid+" and orders.status="+status+" ";
		list=new ArrayList<GoodsOrders>();
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				GoodsOrders g=new GoodsOrders(rs.getString("gname"),rs.getString("pic1"),rs.getString("destroytime"),rs.getInt("num"),rs.getFloat("totalprice"),rs.getInt("status"),rs.getInt("oid"));
				list.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, conn);
		}
		return list;
	}
	public int getcountOrder(String tableName, int size, int uid, int status) {
		// TODO Auto-generated method stub
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=0;
		try {
			String sql="select count(oid) from "+tableName+" where uid="+uid+" and status="+status+"";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return count%size==0?count/size:(count/size+1);
	}
	public List<Orders> findMarketing(int tianshu) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Orders> list=new ArrayList<Orders>();
		String sql="select goodsClass.gcid,goodsClass.gcname,SUM(orders.num) as xsl from goodsClass left join goodsclasslist on goodsClass.gcid=goodsclasslist.gcid left join goods on goods.gclid=goodsclasslist.gclid left join orders on orders.gid=goods.gid and DateDiff(DD,orders.createtime,GETDATE())<"+tianshu+" group by goodsClass.gcid,goodsClass.gcname";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Orders market=new Orders(rs.getInt("gcid"),rs.getString("gcname"),rs.getInt("xsl"));
				list.add(market);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, conn);
		}
		return list;
	}
	public int getPageNum(int size, int status) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=0;
		try {
			String sql="select count(oid) from orders where status="+status;
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				count=rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, bd.conn);
		}
		return count%size==0?count/size:(count/size+1);
	}
	public List<Orders> queryOrderByStatusInPage(int status, int pageNum, int size) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Orders> list=new ArrayList<Orders>();
		//String sql="select top("+size+") * from Orders where "+key+" not in(select top("+(pagenum-1)*size+") oid from Orders) and status=1 order by "+key+"";
		String sql="select top("+size+") * from Orders where oid not in(select top("+(pageNum-1)*size+") oid from orders where status="+status+" and isdelete=0) and status="+status+" and isdelete=0";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Orders o=new Orders(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getFloat(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getString(12));
				list.add(o);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, conn);
		}
		return list;
	}
	//
	public Orders queryOrderByOid(int oid) {
		// TODO Auto-generated method stub
		Orders od=null;
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from orders where oid=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, oid);
			rs=pstmt.executeQuery();
			while(rs.next()){
				od=new Orders(rs.getInt("oid"),rs.getInt("gid"),rs.getInt("uid"),rs.getInt("num"),rs.getFloat("totalprice"),rs.getString("createtime"),rs.getString("uname"),rs.getString("address"),rs.getString("tel"),rs.getInt("status"),rs.getInt("isdelete"),rs.getString("beizhu"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, conn);
		}
		return od;
	}
	public int queryOidByUid_status(int uid,int status) {
		// TODO Auto-generated method stub
		int maxoid=0;
		Connection con=bd.getConn();
		PreparedStatement pst=null;
		ResultSet rs=null;
		String sql="select max(oid) from orders where uid=? and status=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, 1);
			rs=pst.executeQuery();
			while(rs.next()){
				maxoid=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pst, con);
		}
		
		return maxoid;
	}
	public List<Orders> queryOrderByCX(String oid, String name, String time,int status) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Orders> list=new ArrayList<Orders>();
		String sql=null;
		if(oid!=""&&name==""&&time==""){
			sql="select * from Orders where status="+status+" and isdelete=0 and oid="+oid;
		}else if(name!=""&&oid==""&&time==""){
			sql="select * from Orders where status="+status+" and isdelete=0 and uname='"+name+"'";
		}else if(time!=""&&oid==""&&name==""){
			sql="select * from Orders where status="+status+" and isdelete=0 and DATEDIFF(DD,'"+time+"',createtime)=0";
		}else if(oid!=""&&name!=""&&time==""){
			sql="select * from orders where status="+status+" and isdelete=0 and oid="+oid+" and uname='"+name+"'";
		}else if(oid!=""&&time!=""&&name==""){
			sql="select * from Orders where status="+status+" and isdelete=0 and oid="+oid+" and DATEDIFF(DD,'"+time+"',createtime)=0";
		}else if(name!=""&&oid==""&&time!=""){
			sql="select * from Orders where status="+status+" and isdelete=0 and uname='"+name+"' and DATEDIFF(DD,'"+time+"',createtime)=0";
		}else if(name!=""&&oid!=""&&time!=""){
			sql="select * from Orders where status="+status+" and isdelete=0 and oid="+oid+" and uname='"+name+"' and DATEDIFF(DD,'"+time+"',createtime)=0";
		}
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Orders o=new Orders(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getFloat(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getInt(10),rs.getInt(11),rs.getString(12));
				list.add(o);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(bd.rs, bd.pstmt, conn);
		}
		return list;
	}
	public List<Orders> findAmountByMonth(int m) {
		Connection conn=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Orders> list=new ArrayList<Orders>();
		String sql="select goodsClass.gcid,goodsClass.gcname,SUM(orders.num) as xsl from goodsClass left join goodsclasslist on goodsClass.gcid=goodsclasslist.gcid left join goods on goods.gclid=goodsclasslist.gclid left join orders on orders.gid=goods.gid and DATEPART(MM,orders.createtime)="+m+" group by goodsClass.gcid,goodsClass.gcname";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				Orders market=new Orders(rs.getInt("gcid"),rs.getString("gcname"),rs.getInt("xsl"));
				list.add(market);
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, conn);
		}
		return list;
	}
}
