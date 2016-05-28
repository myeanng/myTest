package com.yourcompany.struts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {
	public boolean checkLogin(String name,String pwd){
		Connection conn=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		boolean jg=false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String connURL="jdbc:oracle:thin:@localhost:1521:orcl";
			conn=DriverManager.getConnection(connURL,"scott","tiger");
			stmt=conn.prepareStatement("select * from admin where name=? and pwd=?");
			stmt.setString(1, name);
			stmt.setString(2, pwd);
			rs=stmt.executeQuery();
			if(rs.next()){
				jg=true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jg;
	}
}
