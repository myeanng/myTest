package ssm.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import ssm.springmvc.dao.UserDao;
import ssm.springmvc.entity.User;
import ssm.springmvc.service.UserServicce;

@Repository("userService")
public class UserServiceImpl implements UserServicce {
	private UserDao userDao;
	public int add(User user) {
		// TODO Auto-generated method stub
		return userDao.add(user);
	}
	@Resource(name="userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
