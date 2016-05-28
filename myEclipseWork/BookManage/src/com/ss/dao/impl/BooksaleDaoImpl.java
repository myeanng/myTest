package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.ss.dao.BooksaleDao;
import com.ss.entity.Booksale;
import com.ss.factory.DaoFactory;

public class BooksaleDaoImpl implements BooksaleDao {

	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	public int add(Booksale booksale) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("insert into t_booksale (bookisbn,saledate,salenum,allprice,operator) values(?,?,?,?,?)");
			stmt.setString(1, booksale.getBookisbn());
			stmt.setString(2, booksale.getSaledate()+"");
			stmt.setString(3, booksale.getSalenum()+"");
			stmt.setString(4, booksale.getAllprice()+"");
			stmt.setString(5, booksale.getOperator());
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public List<Booksale> que(String sql) {
		// TODO Auto-generated method stub
		List<Booksale> list=new ArrayList<Booksale>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			while(rs.next()){
				Date date = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy", Locale.ENGLISH).parse(rs.getString(2));
				Booksale p=new Booksale(rs.getString(1),date,rs.getInt(3),rs.getDouble(4),rs.getString(5));
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
