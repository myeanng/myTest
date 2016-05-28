package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ss.dao.CategoryDao;
import com.ss.entity.Category;
import com.ss.factory.DaoFactory;

public class CategoryDaoImpl implements CategoryDao {

	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	public int add(Category category) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("insert into t_category (Categoryid,Categoryname,Categorydesc) values(?,?,?)");
			stmt.setString(1, category.getCategoryid()+"");
			stmt.setString(2, category.getCategoryname());
			stmt.setString(3, category.getCategorydesc());
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public int del(int categoryid) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("delete t_category where categoryid=? ");
			stmt.setString(1, categoryid+"");
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public List<Category> queAll() {
		// TODO Auto-generated method stub
		List<Category> list=new ArrayList<Category>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_Category ");
			rs=stmt.executeQuery();
			while(rs.next()){
				Category p=new Category(rs.getInt(1),rs.getString(2),rs.getString(3));
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

	public boolean queName(String categoryname) {
		// TODO Auto-generated method stub
		boolean b=false;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_category where categoryname=? ");
			stmt.setString(1, categoryname);
			rs=stmt.executeQuery();
			if(rs.next()){
				b=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}		
		return b;
	}

	public int upd(Category category) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("update t_category set categoryname=? where categoryid=?");
			stmt.setString(1, category.getCategoryname());
			stmt.setString(2, category.getCategoryid()+"");
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

}
