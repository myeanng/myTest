package com.ss.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ss.dao.UserDao;
import com.ss.entity.User;
import com.ss.factory.DaoFactory;

public class UserDaoImpl implements UserDao {
	DaoFactory df=new DaoFactory();
	Connection conn=null;
	PreparedStatement stmt=null;
	ResultSet rs=null;
	//添加用户
	public int add(User user) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("insert into t_user (loginname,loginpwd,roleid) values(?,?,?)");
			stmt.setString(1, user.getLoginname());
			stmt.setString(2, user.getLoginpwd());
			stmt.setString(3, user.getRoleid()+"");
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}

	public int del(int id) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("delete t_user where userid=? ");
			stmt.setString(1, id+"");
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
				df.closeAll(conn, stmt, rs);
		}
		
		return row;
	}
	//查询所有用户
	public List<User> queAll() {
		// TODO Auto-generated method stub
		List<User> list=new ArrayList<User>();
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_user ");
			rs=stmt.executeQuery();
			while(rs.next()){
				User user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				list.add(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}		
		return list;
	}
	//查询用户名是否存在
	public boolean queName(String loginname) {
		// TODO Auto-generated method stub
		boolean b=false;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_user where loginname=? ");
			stmt.setString(1, loginname);
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

	public User queUser(String loginname, String loginpwd) {
		// TODO Auto-generated method stub
		User user=null;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("select * from t_user where loginname=? and loginpwd=? ");
			stmt.setString(1, loginname);
			stmt.setString(2, loginpwd);
			rs=stmt.executeQuery();
			if(rs.next()){
				user=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}		
		return user;
	}

	public int updPwd(String name, String pwd) {
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("update t_user set loginpwd=? where loginname=?");
			stmt.setString(1, pwd);
			stmt.setString(2, name);
			row=stmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			df.closeAll(conn, stmt, rs);
		}
		
		return row;

	}

	public int updRoleid(int id, int roleid) {
		// TODO Auto-generated method stub
		int row=0;
		try {
			conn=df.getConn();
			stmt=conn.prepareStatement("update t_user set roleid=? where userid=?");
			if(roleid==1){
				stmt.setString(1, 0+"");
			}else if(roleid==0){
				stmt.setString(1, 1+"");
			}
			stmt.setString(2, id+"");
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
