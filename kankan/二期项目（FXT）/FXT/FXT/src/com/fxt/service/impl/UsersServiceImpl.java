package com.fxt.service.impl;

import java.util.List;

import com.fxt.dao.UsersDao;
import com.fxt.dao.impl.UsersDaoImpl;
import com.fxt.entity.Users;
import com.fxt.service.UsersService;

public class UsersServiceImpl implements UsersService {
	UsersDao ud=new UsersDaoImpl();
	public Users login(String username, String userpwd) {
		
		return ud.login(username, userpwd);
	}
	public boolean queryUserByUsername(String username) {
		
		return ud.queryUserByUsername(username);
	}
	public List<Users> queryAllUser() {
		
		return ud.queryAllUser();
	}
	public int reg(String username, String userpwd, String tel,int x) {
		
		return ud.reg(username, userpwd, tel,x);
	}
	public boolean queryUserByTel(String tel) {
		// TODO Auto-generated method stub
		return ud.queryUserByTel(tel);
	}
	public Users UpShowUser(int uid) {
		// TODO Auto-generated method stub
		return ud.UpShowUser(uid);
	}
	public int AddHead(int uid, String head) {
		// TODO Auto-generated method stub
		return ud.AddHead(uid, head);
	}
	public int ReviseUsersMessage(String name, String tel, String pwd, int uid) {
		// TODO Auto-generated method stub
		return ud.ReviseUsersMessage(name, tel, pwd, uid);
	}
	public int UpUserMessage(String sex, String time, String shenfen,
			String xingqu, int uid) {
		// TODO Auto-generated method stub
		return ud.UpUserMessage(sex, time, shenfen, xingqu, uid);
	}
	public int querypage(int size) {
		// TODO Auto-generated method stub
		return ud.querypage(size);
	}
	public List<Users> queryUsersBypage(int size, int page) {
		// TODO Auto-generated method stub
		return ud.queryUsersBypage(size, page);
	}
	public int UpUsersStatusByUid(int uid, int status) {
		// TODO Auto-generated method stub
		return ud.UpUsersStatusByUid(uid, status);
	}
	public List<Users> queryGuanLiYuan(int isadmin) {
		// TODO Auto-generated method stub
		return ud.queryGuanLiYuan(isadmin);
	}
	public int SelectMaxUid() {
		// TODO Auto-generated method stub
		return ud.SelectMaxUid();
	}
}
