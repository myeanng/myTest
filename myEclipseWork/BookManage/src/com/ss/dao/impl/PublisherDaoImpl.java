package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ss.dao.PublisherDao;
import com.ss.entity.Publisher;
import com.ss.factory.DaoFactory;

public class PublisherDaoImpl implements PublisherDao {

	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	
	public int add(Publisher publisher) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("insert into t_publisher (publisherid,publishername) values(?,?)");
			stmt.setString(1, publisher.getPublisherid()+"");
			stmt.setString(2, publisher.getPublishername());
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public int del(int publisherid) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("delete t_publisher where publisherid=? ");
			stmt.setString(1, publisherid+"");
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public List<Publisher> queAll() {
		// TODO Auto-generated method stub
		List<Publisher> list=new ArrayList<Publisher>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_Publisher ");
			rs=stmt.executeQuery();
			while(rs.next()){
				Publisher p=new Publisher(rs.getInt(1),rs.getString(2));
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

	public boolean queName(String publishername) {
		// TODO Auto-generated method stub
		boolean b=false;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_publisher where publishername=? ");
			stmt.setString(1, publishername);
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

	public int upd(Publisher publisher) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("update t_publisher set publishername=? where publisherid=?");
			stmt.setString(1, publisher.getPublishername());
			stmt.setString(2, publisher.getPublisherid()+"");
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
