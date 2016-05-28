package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ss.dao.PowerDao;
import com.ss.entity.Power;
import com.ss.entity.Relation;
import com.ss.factory.DaoFactory;

public class PowerDaoImpl implements PowerDao {
	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	public int add(Power power) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int del(int powerid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Power> queAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean queName(String powername) {
		// TODO Auto-generated method stub
		return false;
	}

	public int upd(Power power) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Power> que(List<Relation> list) {
		// TODO Auto-generated method stub
		List<Power> plist=new ArrayList<Power>();
		try {
			for(int i=0;i<list.size();i++){
				conn=df.getConn();
				stmt=conn.prepareStatement("select * from t_Power where Powerid=? ");
				stmt.setString(1, list.get(i).getPowerid()+"");
				rs=stmt.executeQuery();
				if(rs.next()){
					Power p=new Power(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
					plist.add(p);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		
		return plist;
	}

}
