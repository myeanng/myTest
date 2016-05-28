package com.ss.dao;

import com.ss.entity.Board;

public interface BoardDao {
	int add(Board board);
	int del(int id);
	int upd(Board board);
	Board sel(int id);
}
