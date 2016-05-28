package ssm.springmvc.dao.impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import ssm.springmvc.dao.UserDao;
import ssm.springmvc.entity.User;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Resource(name="sqlSessionTemplate")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	public int add(User user) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.getMapper(UserDao.class).add(user);
	}

}
