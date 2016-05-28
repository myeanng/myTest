package com.fxt.service;

import java.util.List;

import com.fxt.entity.Users;

public interface UsersService {
	public Users login(String username,String userpwd);
	public boolean queryUserByUsername(String username);
	public List<Users> queryAllUser();
	public int reg(String username, String userpwd,String tel,int x);
	public boolean queryUserByTel(String tel);
	public Users UpShowUser(int uid);//更新后查询用户表的信息
	public int AddHead(int uid,String head);//用户添加头像
	
	public int ReviseUsersMessage(String name,String tel,String pwd,int uid);//处理数据
	public int UpUserMessage(String sex,String time,String shenfen,String xingqu,int uid);
	//后台查询用户的页数
		public int querypage(int size);
		//后台查询每页的用户信息
		public List<Users> queryUsersBypage(int size,int page);
		//后台更改用户的使用状态
		public int UpUsersStatusByUid(int uid,int status);
		//后台查询管理员用户
		public List<Users> queryGuanLiYuan(int isadmin);
		//查询刚刚注册的用户的UID
		public int SelectMaxUid();
}
