package com.zzzy.music.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoFactory {
	public Connection getConn(){
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String connURL="jdbc:oracle:thin:@localhost:1521:orcl";
			conn=DriverManager.getConnection(connURL,"scott","tiger");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return conn;
	}
	public void closeAll(Connection conn,PreparedStatement stmt,ResultSet rs){
		
			try {
				if(conn!=null){
					conn.close();
					}
				if(stmt!=null){
					stmt.close();
					}
				if(rs!=null){
					rs.close();
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
