package com.zzzy.music.biz;

import java.util.List;

import com.zzzy.music.entity.Message;
import com.zzzy.music.entity.Music;
import com.zzzy.music.entity.Tip;
import com.zzzy.music.entity.User;

public interface MusicBiz {
	//UserDao的方法
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	User findUser(int id);
	User findUser(String name,String pwd);
	User findUser(String name);
	List<User> findAllUser();
	List<User> findAllUserByPage();
	//MusicDao的方法
	void addMusic(Music music);
	void updateMusic(Music music);
	void deleteMusic(int id);
	Music findMusic(int id);
	List<Music> findAllMusic();
	List<Music> findAllMusicByPage();
	//MessageDao的方法
	void addMessage(Message message);
	void updateMessage(Message message);
	void deleteMessage(int id);
	Message findMessage(int id);
	List<Message> findAllMessage();
	List<Message> findMyMessage(int id);
	List<Message> findAllMessageByPage();
	//TipDao的方法
	void addTip(Tip tip);
	void updateTip(Tip tip);
	void deleteTip(int id);
	Tip findTip(int id);
	List<Tip> findAllTip();
	List<Tip> findAllTipByPage();
	//自定义的方法
}
