package com.ss.dao;

import java.util.List;

import com.ss.entity.Power;
import com.ss.entity.Relation;

public interface PowerDao {
	int add(Power power);
	int del(int powerid);
	int upd(Power power);
	List<Power> queAll();
	List<Power> que(List<Relation> list);
	boolean queName(String powername);
}
