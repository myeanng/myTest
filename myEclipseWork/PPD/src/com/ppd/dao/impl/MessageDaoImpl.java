package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.MessageDao;
import com.ppd.entity.Message;
import com.ppd.util.SqlSessionDaoSupportTool;

@Repository("messageDao")
public class MessageDaoImpl extends SqlSessionDaoSupportTool implements
		MessageDao {

	public boolean add(Message entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(MessageDao.class).add(entity);
	}

	public boolean del(Message entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Message> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Message queryById(Integer id) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(MessageDao.class).queryById(id);
	}

	public List<Message> queryByParam(Message entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(MessageDao.class).queryByParam(entity);
	}

	public boolean up(Message entity) {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(MessageDao.class).up(entity);
	}

}
