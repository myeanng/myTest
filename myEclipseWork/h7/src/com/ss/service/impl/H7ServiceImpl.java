package com.ss.service.impl;

import java.util.List;

import com.ss.dao.MessageDao;
import com.ss.dao.TypeDao;
import com.ss.dao.impl.MessageDaoImpl;
import com.ss.dao.impl.TypeDaoImpl;
import com.ss.entity.Message;
import com.ss.entity.Type;
import com.ss.service.H7Service;

public class H7ServiceImpl implements H7Service {
	
	TypeDao td=new TypeDaoImpl();
	MessageDao md=new MessageDaoImpl();
	

	public void add(Type type) {
		// TODO Auto-generated method stub
		td.add(type);
	}

	public void add(Message message) {
		// TODO Auto-generated method stub
		md.add(message);
	}

	public List<Type> findAllType() {
		// TODO Auto-generated method stub
		return td.findAll();
	}

	public Message findMessage(int id) {
		// TODO Auto-generated method stub
		return md.find(id);
	}

	public List<Message> findMessage(String hql) {
		// TODO Auto-generated method stub
		return md.find(hql);
	}

	public List<Type> findType() {
		// TODO Auto-generated method stub
		return td.find();
	}

}
