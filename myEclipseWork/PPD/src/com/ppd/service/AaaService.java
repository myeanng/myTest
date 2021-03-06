package com.ppd.service;

import java.util.List;
import java.util.Map;

import com.ppd.entity.*;

public interface AaaService {
	//提现和充值返回用户账户信息
	List<Bill> uPaccount(Users users,double money);
	//根据时间,类型,用户ID,查询资金记录(classType=0时查询所有)
	List<Bill> findBill(int classType,int dateType,int userid);
	//查找用户基本资料及Loan列表和账户信息,信用额度,并计算可用信用额度
	Map findUsersAccountLoan(int userid);
	//查找用户基本资料及Duein列表和账户信息
	Map findUsersAccountDuein(int userid);
	//修改用户信息并返回用户新信息
	Users upUsers(Users users);
	//查找认证情况安全中心,返回是否有安全问题和信息认证的Map
	Map aqzx(Users user);
	//查找安全问题
	List<Question> findQuestion();
	//查找我的消息
	List<Message> findMessage(Message message);
	//查询单个消息
	Message findMessage(int messageid);
	//标记删除单个消息
	void upMessage(int messageid);
	//联合查询基本信息
	Users findUserAndUserinfo(int userid);
	//查找用户基本信息
	Userinfo findUserinfo(int userid);
	//修改基本资料
	void upUserinfo(Userinfo userinfo);
	//根据时间,类型,用户ID,查询待收记录(classType=0时查询所有)
	List<Duein> findDuein(int classType,int dateType,int userid);
	//登陆历史
	List<Landingrecord> findLandingrecord(int userid);
	//查找我的项目(用户ID,项目状态[status=99代表查询已成功发布的项目])
	List<Loan> findLoan(int userid,int status);
	//修改认证信息
	void upSafety(Safety safety);
	
}
