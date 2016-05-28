package com.zzzy.music.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzzy.music.biz.MusicBiz;
import com.zzzy.music.dao.MessageDao;
import com.zzzy.music.dao.MusicDao;
import com.zzzy.music.dao.TipDao;
import com.zzzy.music.dao.UserDao;
import com.zzzy.music.entity.Message;
import com.zzzy.music.entity.Music;
import com.zzzy.music.entity.Tip;
import com.zzzy.music.entity.User;
@Service("musicBiz")
public class MusicBizImpl implements MusicBiz {

	//注入实现DaoImpl
	@Autowired
	private UserDao userDao;
	@Autowired
	private MusicDao musicDao;
	@Autowired
	private MessageDao messageDao;
	@Autowired
	private TipDao tipDao;
	public void addMessage(Message message) {
		// TODO Auto-generated method stub
		messageDao.addMessage(message);
	}

	public void addMusic(Music music) {
		// TODO Auto-generated method stub
		musicDao.addMusic(music);
	}

	public void addTip(Tip tip) {
		// TODO Auto-generated method stub
		tipDao.addTip(tip);
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	public void deleteMessage(int id) {
		// TODO Auto-generated method stub
		messageDao.deleteMessage(id);
	}

	public void deleteMusic(int id) {
		// TODO Auto-generated method stub
		musicDao.deleteMusic(id);
	}

	public void deleteTip(int id) {
		// TODO Auto-generated method stub
		tipDao.deleteTip(id);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
	}

	public List<Message> findAllMessage() {
		// TODO Auto-generated method stub
		return messageDao.findAllMessage();
	}

	public List<Message> findAllMessageByPage() {
		// TODO Auto-generated method stub
		return messageDao.findAllMessageByPage();
	}

	public List<Music> findAllMusic() {
		// TODO Auto-generated method stub
		return musicDao.findAllMusic();
	}

	public List<Music> findAllMusicByPage() {
		// TODO Auto-generated method stub
		return musicDao.findAllMusicByPage();
	}

	public List<Tip> findAllTip() {
		// TODO Auto-generated method stub
		return tipDao.findAllTip();
	}

	public List<Tip> findAllTipByPage() {
		// TODO Auto-generated method stub
		return tipDao.findAllTipByPage();
	}

	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAllUser();
	}

	public List<User> findAllUserByPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Message findMessage(int id) {
		// TODO Auto-generated method stub
		return messageDao.findMessage(id);
	}

	public Music findMusic(int id) {
		// TODO Auto-generated method stub
		return musicDao.findMusic(id);
	}

	public Tip findTip(int id) {
		// TODO Auto-generated method stub
		return tipDao.findTip(id);
	}

	public User findUser(int id) {
		// TODO Auto-generated method stub
		return userDao.findUser(id);
	}

	public User findUser(String name, String pwd) {
		// TODO Auto-generated method stub
		return userDao.findUser(name, pwd);
	}

	public void updateMessage(Message message) {
		// TODO Auto-generated method stub
		messageDao.updateMessage(message);
	}

	public void updateMusic(Music music) {
		// TODO Auto-generated method stub
		musicDao.updateMusic(music);
	}

	public void updateTip(Tip tip) {
		// TODO Auto-generated method stub
		tipDao.updateTip(tip);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}
	//实现DaoImpl的Get,Set方法

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public MusicDao getMusicDao() {
		return musicDao;
	}

	public void setMusicDao(MusicDao musicDao) {
		this.musicDao = musicDao;
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public TipDao getTipDao() {
		return tipDao;
	}

	public void setTipDao(TipDao tipDao) {
		this.tipDao = tipDao;
	}

	public User findUser(String name) {
		// TODO Auto-generated method stub
		return userDao.findUser(name);
	}

	public List<Message> findMyMessage(int id) {
		// TODO Auto-generated method stub
		return messageDao.findMyMessage(id);
	}
	
}
