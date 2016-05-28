package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.fxt.dao.GoodsClassListDao;
import com.fxt.entity.GoodsClass;
import com.fxt.entity.GoodsClassList;
import com.fxt.util.BaseDao;

public class GoodsClassListDaoImpl implements GoodsClassListDao {
	BaseDao bd=new BaseDao("FXT");

	public GoodsClassList queryGoodsClassListByGclid(int gclid) {
		// TODO Auto-generated method stub
		GoodsClassList gcl=null;
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			conn=bd.getConn();
			st=conn.createStatement();
			String sql="select * from goodsclasslist where gclid="+gclid;
			rs=st.executeQuery(sql);
			while(rs.next()){
				gcl=new GoodsClassList(rs.getInt(1),rs.getInt(2),rs.getString(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, conn);
		}
		return gcl;
	}

	public GoodsClass queryGoodsClassByGclid(int gclid) {
		// TODO Auto-generated method stub
		GoodsClass gc=null;
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			conn=bd.getConn();
			st=conn.createStatement();
			String sql="select * from goodsclass where gcid=(select gcid from goodsclasslist where gclid="+gclid+")";
			rs=st.executeQuery(sql);
			while(rs.next()){
				gc=new GoodsClass(rs.getInt(1),rs.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, conn);
		}
		return gc;
	}

}
