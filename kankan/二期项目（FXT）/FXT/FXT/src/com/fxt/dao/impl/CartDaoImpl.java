package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fxt.dao.CartDao;
import com.fxt.entity.Cart;
import com.fxt.util.BaseDao;

public class CartDaoImpl implements CartDao {
	BaseDao bd=new BaseDao("FXT");

	public int addcart(Cart Carts) {
		// TODO Auto-generated method stub
		int rows=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="insert Cart values(?,?,?,?,?,?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,Carts.getUid());
			pstmt.setInt(2, Carts.getGid());
			pstmt.setString(3, Carts.getGname());
			pstmt.setString(4, Carts.getGpic1());
			pstmt.setInt(5,Carts.getNum());
			pstmt.setFloat(6, Carts.getTotalmoney());
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return rows;
	}

	public Cart queryCartByUid_Gid(int uid, int gid) {
		// TODO Auto-generated method stub
		Cart ca=null;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String sql="select * from cart where uid=? and gid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, uid);
			pstmt.setInt(2, gid);
			rs=pstmt.executeQuery();
			while(rs.next()){
				ca=new Cart(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(6),rs.getFloat(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, pstmt, con);
		}
		return ca;
	}

	public int upCartByUid_Gid(int uid, int gid, int num,float totalmoney) {
		// TODO Auto-generated method stub
		int rows=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="update cart set num=?,totalmoney=? where uid=? and gid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setFloat(2, totalmoney);
			pstmt.setInt(3, uid);
			pstmt.setInt(4, gid);
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return rows;
	}

	public List<Cart> queryCartByUid(int uid) {
		// TODO Auto-generated method stub
		List<Cart> cartlist=new ArrayList<Cart>();
		Connection con=bd.getConn();
		Statement st=null;
		ResultSet rs=null;
		String sql="select * from cart where uid="+uid;
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				cartlist.add(new Cart(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getFloat(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		return cartlist;
	}

	public int DelCartByGid_Uid(int gid, int uid) {
		int rows=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="delete cart where gid=? and uid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, gid);
			pstmt.setInt(2, uid);
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return rows;
	}

}
