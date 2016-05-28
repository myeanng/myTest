package com.ss.service;

import java.util.List;

import com.ss.entity.Message;
import com.ss.entity.Type;

public interface H7Service {
	List<Type> findAllType();
	List<Type> findType();
	Message findMessage(int id);
	List<Message> findMessage(String hql);
	void add(Type type);
	void add(Message message);
}
