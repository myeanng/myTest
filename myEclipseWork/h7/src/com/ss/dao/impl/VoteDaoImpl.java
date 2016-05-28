package com.ss.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ss.dao.VoteDao;
import com.ss.entity.Vote;
import com.ss.entity.Votecontext;
import com.ss.factory.HibernateSessionFactory;

public class VoteDaoImpl implements VoteDao {

	Session session=null;
	Transaction tx=null;
	
	public void add(Vote vote) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			session.save(vote);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
	}

	public List<Vote> find() {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		List<Vote> list=new ArrayList<Vote>();
		String hql="from Vote";
		
		try {
			list=session.createQuery(hql).list();
			for (Vote vote : list) {
				vote.getVotecontexts().size();
			}
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
	}

	public List<Vote> findTitle(String str) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		List<Vote> list=new ArrayList<Vote>();
		String hql="from Vote v where v.title like ?";
		
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, "%"+str+"%");
			list=query.list();
			for (Vote vote : list) {
				vote.getVotecontexts().size();
			}
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
	}

	public long findType(byte type) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		String hql="select count(v) from Vote v where v.type=?";
		Long i=null;
		try {
			Query query=session.createQuery(hql);
			query.setParameter(0, type);
			i=(Long)query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			//tx.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		return i;
	}

	public void update(Vote vote) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		
		try {
			Vote v=(Vote)session.load(Vote.class, vote.getId());
			
			v.setPublish(vote.getPublish());
			v.setType(vote.getType());
			v.getVotecontexts().clear();
			for (Votecontext votecontext : vote.getVotecontexts()) {
				System.out.println(votecontext.getContext());
				v.getVotecontexts().add(votecontext);
			}
			session.saveOrUpdate(vote);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
	}

	public Vote find(int id) {
		// TODO Auto-generated method stub
		session =HibernateSessionFactory.getSession();
		tx=session.beginTransaction();
		Vote v=null;
		try {
			v=(Vote)session.load(Vote.class, id);
			v.getVotecontexts().size();
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
		}finally{
			session.close();
		}
		return v;
	}

}
