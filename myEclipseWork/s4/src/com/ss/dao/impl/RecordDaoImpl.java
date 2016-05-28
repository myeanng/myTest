package com.ss.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ss.dao.RecordDao;
import com.ss.entity.Record;

public class RecordDaoImpl extends HibernateTemplate implements RecordDao {

	public void add(Record record) {
		// TODO Auto-generated method stub
		save(record);
	}

	public List<Record> find() {
		// TODO Auto-generated method stub
		return find("from Record");
	}

}
