package com.ss.service;

import java.util.List;

import com.ss.entity.Admin;
import com.ss.entity.Vote;
import com.ss.entity.Votecontext;
import com.ss.entity.Voter;

public interface H8Service {
	void add(Admin admin);
	void update(Admin admin);
	Admin login(Admin admin);
	
	void add(Vote vote);
	void update(Vote vote);
	List<Vote> findVote();
	List<Vote> findTitle(String str);
	long findType(byte type);
	
	void add(Voter voter);
	
	void add(Votecontext votecontext);
	void update(Votecontext votecontext);
	List<Votecontext> findVotecontext();
	
	//����ID����ȫ����Ϣ(����ѡ��)
	Vote findVote(int id);
}
