package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.ss.dao.BookbuyDao;
import com.ss.entity.Bookbuy;
import com.ss.factory.DaoFactory;

public class BookbuyDaoImpl implements BookbuyDao {

	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	public int add(Bookbuy bookbuy) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("insert into t_bookbuy (bookisbn,buydate,buynum,operator) values(?,?,?,?)");
			stmt.setString(1, bookbuy.getBookisbn());
			stmt.setString(2, bookbuy.getBuydate().toString());
			stmt.setString(3, bookbuy.getBuynum()+"");
			stmt.setString(4, bookbuy.getOperator());
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public List<Bookbuy> que(String sql) {
		// TODO Auto-generated method stub
		List<Bookbuy> list=new ArrayList<Bookbuy>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			while(rs.next()){
				Date date = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy", Locale.ENGLISH).parse(rs.getString(2));
				Bookbuy p=new Bookbuy(rs.getString(1),date,rs.getInt(3),rs.getString(4));
				list.add(p);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}		
		return list;
	}

}
