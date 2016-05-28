package com.sx.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDao {
public List<Admin> findAll()throws Exception {
	List<Admin> list=new ArrayList<Admin>();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String connURL="jdbc:oracle:thin:@localhost:1521:orcl";
		conn=DriverManager.getConnection(connURL,"scott","tiger");
		stmt=conn.prepareStatement("select id,name,pwd from admin");
		rs=stmt.executeQuery();
		while(rs.next()){
			Admin a=new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
			list.add(a);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw e;
	}finally{
		try {
			conn.close();
			stmt.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	return list;
}
	public int addAdmin(Admin admin)throws Exception{
		int row=0;
		Connection conn=null;
		PreparedStatement stmt=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String connURL="jdbc:oracle:thin:@localhost:1521:orcl";
			conn=DriverManager.getConnection(connURL,"scott","tiger");
			stmt=conn.prepareStatement("insert into admin (name,pwd) values(?,?)");
			stmt.setString(1, admin.getName());
			stmt.setString(2, admin.getPwd());
			row=stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}finally{
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}
	public int delAdmin(int id)throws Exception{
		int row=0;
		Connection conn=null;
		PreparedStatement stmt=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String connURL="jdbc:oracle:thin:@localhost:1521:orcl";
			conn=DriverManager.getConnection(connURL,"scott","tiger");
			stmt=conn.prepareStatement("delete admin where id=?");
			stmt.setInt(1, id);
			row=stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}finally{
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}
	public int updAdmin(Admin admin)throws Exception{
		int row=0;
		Connection conn=null;
		PreparedStatement stmt=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String connURL="jdbc:oracle:thin:@localhost:1521:orcl";
			conn=DriverManager.getConnection(connURL,"scott","tiger");
			stmt=conn.prepareStatement("update admin set pwd=? where id=?");
			stmt.setString(1, admin.getPwd());
			stmt.setInt(2, admin.getId());
			row=stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}finally{
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return row;
	}
}
