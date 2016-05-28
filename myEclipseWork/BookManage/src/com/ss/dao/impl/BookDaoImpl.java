package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ss.dao.BookDao;
import com.ss.entity.Book;
import com.ss.factory.DaoFactory;

public class BookDaoImpl implements BookDao {

	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	public int add(Book book) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("insert into t_book (bookisbn,bookname,bookdesc,publisherid,author,categoryid,saleprice,nownum,status) values(?,?,?,?,?,?,?,?,1)");
			stmt.setString(1, book.getBookisbn());
			stmt.setString(2, book.getBookname());
			stmt.setString(3, book.getBookdesc());
			stmt.setString(4, book.getPublisherid()+"");
			stmt.setString(5, book.getAuthor());
			stmt.setString(6, book.getCategoryid()+"");
			stmt.setString(7, book.getSaleprice()+"");
			stmt.setString(8, book.getNownum()+"");
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public int del(int bookid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Book> queAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Book> queBook(String sql) {
		// TODO Auto-generated method stub
		List<Book> list=new ArrayList<Book>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			while(rs.next()){
				Book p=new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getDouble(7),rs.getInt(8),rs.getInt(9));
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

	public boolean queName(String bookname) {
		// TODO Auto-generated method stub
		return false;
	}

	public int upd(Book book) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("update t_book set nownum=?,bookname=?,bookdesc=?,publisherid=?,author=?,categoryid=?,saleprice=?,status=? where bookisbn=? ");
			stmt.setString(9, book.getBookisbn());
			stmt.setString(2, book.getBookname());
			stmt.setString(3, book.getBookdesc());
			stmt.setString(4, book.getPublisherid()+"");
			stmt.setString(5, book.getAuthor());
			stmt.setString(6, book.getCategoryid()+"");
			stmt.setString(7, book.getSaleprice()+"");
			stmt.setString(1, book.getNownum()+"");
			stmt.setString(8, book.getStatus()+"");
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public Book queISBN(String isbn) {
		// TODO Auto-generated method stub
		Book b=null;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_book where bookisbn=?");
			stmt.setString(1, isbn);
			rs=stmt.executeQuery();
			while(rs.next()){
				b=new Book(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6),rs.getDouble(7),rs.getInt(8),rs.getInt(9));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}		
		return b;
	}

}
