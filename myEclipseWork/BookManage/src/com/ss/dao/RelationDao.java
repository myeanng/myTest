package com.ss.dao;

import java.util.List;

import com.ss.entity.Relation;

public interface RelationDao {
	//��ӹ�ϵ
	int add(Relation relation);
	//ɾ����ϵ
	int del(int roleid);
	//���ҹ�ϵ
	List<Relation> que(int roleid);
}
