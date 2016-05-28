package com.ss.dao;

import java.util.List;

import com.ss.entity.Record;

public interface RecordDao {
	void add(Record record);
	List<Record> find();
}
