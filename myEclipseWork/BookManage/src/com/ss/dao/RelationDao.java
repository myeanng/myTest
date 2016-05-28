package com.ss.dao;

import java.util.List;

import com.ss.entity.Relation;

public interface RelationDao {
	//添加关系
	int add(Relation relation);
	//删除关系
	int del(int roleid);
	//查找关系
	List<Relation> que(int roleid);
}
