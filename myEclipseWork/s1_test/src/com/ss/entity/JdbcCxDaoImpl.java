package com.ss.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ss.dao.CxDao;
import com.ss.factory.DaoFactory;

public class JdbcCxDaoImpl implements CxDao {

	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	public List<BM> findAll() {
		// TODO Auto-generated method stub
		List<BM> list=new ArrayList<BM>();
		String sql="select * from t_s1_BM";
		System.out.println(sql);
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			while(rs.next()){
				BM p=new BM(rs.getInt(1),rs.getString(2),rs.getInt(3));
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
