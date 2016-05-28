package com.ss.dao;

import java.util.List;

import com.ss.entity.Votecontext;

public interface VotecontextDao {
	void add(Votecontext votecontext);
	void update(Votecontext votecontext);
	List<Votecontext> find();
}
