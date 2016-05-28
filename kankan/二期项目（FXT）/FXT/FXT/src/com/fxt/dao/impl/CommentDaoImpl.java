package com.fxt.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fxt.dao.CommentDao;
import com.fxt.entity.Comment;
import com.fxt.util.BaseDao;

public class CommentDaoImpl implements CommentDao {
	BaseDao bd=new BaseDao("FXT");

	public int countgoodscomment(int gid) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		int countgoodscomment=0;
		con=bd.getConn();
		try {
			st=con.createStatement();
			String sql="select count(*) from Comment where gid="+gid;
			rs=st.executeQuery(sql);
			while(rs.next()){
				countgoodscomment=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		
		return countgoodscomment;
	}

	public List<Comment> queryCommentByGoodsid(int gid) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Comment> commentlist=new ArrayList();
		con=bd.getConn();
		try {
			st=con.createStatement();
			String sql="select * from Comment where gid="+gid;
			rs=st.executeQuery(sql);
			while(rs.next()){
				Comment com=new Comment(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getString(5));
				commentlist.add(com);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(rs, st, con);
		}
		
		return commentlist;
	}
	public int AddComment(int gid,int uid, String content) {
		// TODO Auto-generated method stub
		Connection con=bd.getConn();
		PreparedStatement st=null;
		int row=0;
		try {
			String sql="insert into comment(gid,uid,contents)  values(?,?,?)";
			st=con.prepareStatement(sql);
			st.setInt(1, gid);
			st.setInt(2, uid);
			st.setString(3, content);
			 row=st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			bd.closeAll(null, st, con);
		}
		return row;
	}
}
