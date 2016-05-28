package com.ppd.dao;

import com.ppd.entity.Users;

public interface UsersDao extends BaseDao<Users> {
	//根据用户ID查找用户基本资料
	Users findUsers(int userid);
	//根据用户ID查找用户的认证情况(需关联查询)
	Users findUsersIdentification(int userid);
	//联合查询
	Users findUserLoanAccount(int id);
	Users findUserDueinAccount(int id);
	Users findUserAndUserinfo(int userid);
}
