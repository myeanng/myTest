package com.ss.dao;

import java.util.List;

import com.ss.entity.User;

public interface UserDao {
	int add(User user);
	int del(int id);
	int updPwd(String name,String pwd);
	int updRoleid(int id,int roleid);
	List<User> queAll();
	User queUser(String loginname,String loginpwd);
	boolean queName(String loginname);
}
