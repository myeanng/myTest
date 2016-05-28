package com.sx4.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sx4.factory.DaoFactory;

import com.sx4.dao.AdminDao;
import com.sx4.entity.Admin;

public class AdminDaoImpl implements AdminDao {

	DaoFactory df=new DaoFactory();
	
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	public int addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("insert into admin (name,pwd) values(?,?)");
			stmt.setString(1, admin.getName());
			stmt.setString(2, admin.getPwd());
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public Admin checkLogin(String name, String pwd) {
		// TODO Auto-generated method stub
		Admin admin=null;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select id,name,pwd from admin where name=? and pwd=? ");
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			rs=stmt.executeQuery();
			if(rs.next()){
				admin=new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		
		return admin;
	}

	public int delAdmin(int id) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("delete admin where id=?");
			stmt.setInt(1, id);
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		List<Admin> list=new ArrayList<Admin>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select id,name,pwd from admin");
			rs=stmt.executeQuery();
			while(rs.next()){
				Admin a=new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
				list.add(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		
		return list;
	}

	public int updAdmin(Admin admin) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("update admin set pwd=? where id=?");
			stmt.setString(1, admin.getPwd());
			stmt.setInt(2, admin.getId());
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
