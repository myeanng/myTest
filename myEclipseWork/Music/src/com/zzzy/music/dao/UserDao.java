package com.zzzy.music.dao;

import java.util.List;

import com.zzzy.music.entity.User;

public interface UserDao {
	void addUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	User findUser(int id);
	User findUser(String name,String pwd);
	User findUser(String name);
	List<User> findAllUser();
	List<User> findAllUserByPage();
}
