package com.fxt.dao;

import java.util.List;

import com.fxt.entity.Comment;

public interface CommentDao {
	public int countgoodscomment(int gid);
	public List<Comment> queryCommentByGoodsid(int gid);
	
	public int AddComment(int gid,int uid, String content);

}
