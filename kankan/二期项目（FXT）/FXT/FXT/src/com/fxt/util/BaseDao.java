package com.fxt.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String url="jdbc:sqlserver://localhost:1433;databasename=";
	private String dbname;
	private static String user="sa";
	private static String password="123@qwe";
	public Connection conn=null;
	public PreparedStatement pstmt=null;
	public CallableStatement cstmt=null;
	public int rows=0;
	public ResultSet rs=null;
	public BaseDao(String dbname) {
		super();
		this.dbname = dbname;
	}
	
	public Connection getConn(){
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url+dbname,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	public int exeUp(String sql,String[] params){
		conn=getConn();
		try {
			pstmt=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstmt.setString(i+1, params[i]);
				}
			}
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}
	
	public ResultSet exeQu(String sql,String[] params){
		conn=getConn();
		try {
			pstmt=conn.prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstmt.setString(i+1, params[i]);
				}
			}
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void closeAll(ResultSet rs,Statement stmt,Connection conn){
		try {
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
