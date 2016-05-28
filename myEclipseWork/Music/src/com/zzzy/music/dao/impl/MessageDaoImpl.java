package com.zzzy.music.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zzzy.music.dao.MessageDao;
import com.zzzy.music.entity.Message;
@Repository("messageDao")
public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {

	//×¢Èësession¹¤³§
	@Autowired
	public void MySetSessionFactory(  SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public void addMessage(Message message) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(message);
	}

	public void deleteMessage(int id) {
		// TODO Auto-generated method stub

	}

	public List<Message> findAllMessage() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Message");
	}

	public List<Message> findAllMessageByPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Message findMessage(int id) {
		// TODO Auto-generated method stub
		Message message=this.getHibernateTemplate().get(Message.class, id);
		message.getMusic().getUrl();
		return message;
	}

	public void updateMessage(Message message) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(message);
	}

	public List<Message> findMyMessage(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Message where toUsre.id=? and msgIsNew=1", id);
	}

}
