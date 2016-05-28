package com.fxt.service;

import java.util.List;

import com.fxt.entity.Comment;

public interface CommentService {
	public int countgoodscomment(int gid);
	public List<Comment> queryCommentByGoodsid(int gid);
	
	public int AddComment(int gid,int uid, String content);

}
