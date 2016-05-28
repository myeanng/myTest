package com.ss.dao;

import java.util.List;

import com.ss.entity.Message;

public interface MessageDao{
	void add(Message message);
	Message find(int id);
	List<Message> find(String hql);
}
