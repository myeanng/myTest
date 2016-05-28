package com.sx4.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sx4.dao.BookDao;
import com.sx4.entity.Book;
import com.sx4.factory.DaoFactory;

public class BookDaoImpl implements BookDao {
	DaoFactory df=new DaoFactory();
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		List<Book> list=new ArrayList<Book>();
		conn=df.getConn();
		try {
			stmt=conn.prepareStatement("select * from book");
			rs=stmt.executeQuery();
			while(rs.next()){
				Book b=new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6));
				list.add(b);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		return list;
	}

	public List<Book> findName(String colName,String keyWords) {
		// TODO Auto-generated method stub
		List<Book> list=new ArrayList<Book>();
		conn=df.getConn();
		try {
			stmt=conn.prepareStatement("select * from book where "+colName+" like ?");
			stmt.setString(1, "%"+keyWords+"%");
			rs=stmt.executeQuery();
			while(rs.next()){
				Book b=new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6));
				list.add(b);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		return list;
	}

}
