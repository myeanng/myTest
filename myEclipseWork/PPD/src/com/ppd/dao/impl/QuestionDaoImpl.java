package com.ppd.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ppd.dao.QuestionDao;
import com.ppd.entity.Question;
import com.ppd.util.SqlSessionDaoSupportTool;

@Repository("questionDao")
public class QuestionDaoImpl extends SqlSessionDaoSupportTool implements
		QuestionDao {

	public boolean add(Question entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean del(Question entity) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Question> queryAll() {
		// TODO Auto-generated method stub
		return getSqlSession().getMapper(QuestionDao.class).queryAll();
	}

	public Question queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Question> queryByParam(Question entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean up(Question entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
