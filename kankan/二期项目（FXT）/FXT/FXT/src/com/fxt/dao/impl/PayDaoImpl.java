package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.fxt.dao.PayDao;
import com.fxt.util.BaseDao;

public class PayDaoImpl implements PayDao {
	BaseDao bd=new BaseDao("FXT");
	public float queryBalanceByUid(int uid) {
		// TODO Auto-generated method stub
		float balance=0;
		Connection con=bd.getConn();
		Statement st=null;
		ResultSet rs=null;
		String sql="select balance from pay where uid="+uid;
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				balance=rs.getFloat(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		return balance;
	}
	public int updateBalanceByUid_Pay(float pay, int uid) {
		// TODO Auto-generated method stub
		int row=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="update pay set balance=balance-? where uid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setFloat(1, pay);
			pstmt.setInt(2, uid);
			row=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return row;
	}
	public int updateBalanceByUid_Pay2(float pay, int uid) {
		// TODO Auto-generated method stub
		int row=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="update pay set balance=balance+? where uid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setFloat(1, pay);
			pstmt.setInt(2, uid);
			row=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return row;
	}
	public int insertPayByUid(int uid) {
		int row=0;
		Connection con=bd.getConn();
		PreparedStatement pstmt=null;
		String sql="insert into pay(uid) values(?)";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, uid);
			row=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, pstmt, con);
		}
		return row;
	}

}
