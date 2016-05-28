package com.zzzy.music.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zzzy.music.dao.TipDao;
import com.zzzy.music.entity.Tip;
@Repository("tipDao")
public class TipDaoImpl extends HibernateDaoSupport implements TipDao {

	//×¢Èësession¹¤³§
	@Autowired
	public void MySetSessionFactory(  SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public void addTip(Tip tip) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(tip);
	}

	public void deleteTip(int id) {
		// TODO Auto-generated method stub

	}

	public List<Tip> findAllTip() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Tip");
	}

	public List<Tip> findAllTipByPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tip findTip(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateTip(Tip tip) {
		// TODO Auto-generated method stub

	}

}
