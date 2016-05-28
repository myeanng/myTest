package com.ss.dao;

import java.util.List;

import com.ss.entity.Vote;

public interface VoteDao {
	void add(Vote vote);
	void update(Vote vote);
	List<Vote> find();
	List<Vote> findTitle(String str);
	long findType(byte type);
	Vote find(int id);
}
