package com.zzzy.music.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.zzzy.music.dao.MusicDao;
import com.zzzy.music.entity.Music;
@Repository("musicDao")
public class MusicDaoImpl extends HibernateDaoSupport implements MusicDao {

	//×¢Èësession¹¤³§
	@Autowired
	public void MySetSessionFactory(  SessionFactory sf){
		super.setSessionFactory(sf);
	}
	
	public void addMusic(Music music) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(music);
	}

	public void deleteMusic(int id) {
		// TODO Auto-generated method stub

	}

	public List<Music> findAllMusic() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Music");
	}

	public List<Music> findAllMusicByPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public Music findMusic(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Music.class, id);
	}

	public void updateMusic(Music music) {
		// TODO Auto-generated method stub

	}

}
