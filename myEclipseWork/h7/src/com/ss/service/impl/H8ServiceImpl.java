package com.ss.service.impl;

import java.util.List;

import com.ss.dao.AdminDao;
import com.ss.dao.VoteDao;
import com.ss.dao.VotecontextDao;
import com.ss.dao.VoterDao;
import com.ss.dao.impl.AdminDaoImpl;
import com.ss.dao.impl.VoteDaoImpl;
import com.ss.dao.impl.VotecontextDaoImpl;
import com.ss.dao.impl.VoterDaoImpl;
import com.ss.entity.Admin;
import com.ss.entity.Vote;
import com.ss.entity.Votecontext;
import com.ss.entity.Voter;
import com.ss.service.H8Service;

public class H8ServiceImpl implements H8Service {
	
	AdminDao ad=new AdminDaoImpl();
	VoteDao vd=new VoteDaoImpl();
	VoterDao vrd=new VoterDaoImpl();
	VotecontextDao vcd=new VotecontextDaoImpl();

	public void add(Admin admin) {
		// TODO Auto-generated method stub
		ad.add(admin);
	}

	public void add(Vote vote) {
		// TODO Auto-generated method stub
		vd.add(vote);
	}

	public void add(Voter voter) {
		// TODO Auto-generated method stub
		vrd.add(voter);
	}

	public void add(Votecontext votecontext) {
		// TODO Auto-generated method stub
		vcd.add(votecontext);
	}

	public List<Vote> findTitle(String str) {
		// TODO Auto-generated method stub
		return vd.findTitle(str);
	}

	public long findType(byte type) {
		// TODO Auto-generated method stub
		return vd.findType(type);
	}

	public List<Vote> findVote() {
		// TODO Auto-generated method stub
		return vd.find();
	}

	public List<Votecontext> findVotecontext() {
		// TODO Auto-generated method stub
		return vcd.find();
	}

	public Admin login(Admin admin) {
		// TODO Auto-generated method stub
		return ad.login(admin);
	}

	public void update(Admin admin) {
		// TODO Auto-generated method stub
		ad.update(admin);
	}

	public void update(Vote vote) {
		// TODO Auto-generated method stub
		vd.update(vote);
	}

	public void update(Votecontext votecontext) {
		// TODO Auto-generated method stub
		vcd.update(votecontext);
	}

	public Vote findVote(int id) {
		// TODO Auto-generated method stub
		return vd.find(id);
	}

}
