package com.zzzy.music.dao;

import java.util.List;

import com.zzzy.music.entity.Message;

public interface MessageDao {
	void addMessage(Message message);
	void updateMessage(Message message);
	void deleteMessage(int id);
	Message findMessage(int id);
	List<Message> findAllMessage();
	List<Message> findMyMessage(int id);
	List<Message> findAllMessageByPage();
}
