package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ss.dao.RelationDao;
import com.ss.entity.Relation;
import com.ss.factory.DaoFactory;

public class RelationDaoImpl implements RelationDao {
	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	public int add(Relation relation) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int del(int roleid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Relation> que(int roleid) {
		// TODO Auto-generated method stub
		List<Relation> list=new ArrayList<Relation>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_Relation where roleid=? ");
			stmt.setString(1, roleid+"");
			rs=stmt.executeQuery();
			while(rs.next()){
				Relation r=new Relation(rs.getInt(1),rs.getInt(2));
				list.add(r);
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
