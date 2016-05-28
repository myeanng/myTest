package com.fxt.service.impl;

import java.util.List;

import com.fxt.dao.impl.CommentDaoImpl;
import com.fxt.entity.Comment;
import com.fxt.service.CommentService;

public class CommentServiceImpl implements CommentService {
	CommentDaoImpl commentdaoimpl=new CommentDaoImpl();

	public int countgoodscomment(int gid) {
		// TODO Auto-generated method stub
		return commentdaoimpl.countgoodscomment(gid);
	}

	public List<Comment> queryCommentByGoodsid(int gid) {
		// TODO Auto-generated method stub
		return commentdaoimpl.queryCommentByGoodsid(gid);
	}

	public int AddComment(int gid, int uid, String content) {
		// TODO Auto-generated method stub
		return commentdaoimpl.AddComment(gid, uid, content);
	}

}
