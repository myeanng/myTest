package com.ss.dao;

import java.util.List;

import com.ss.entity.Demp;

public interface DempDao {
	void addDemp(Demp demp);
	void updateDemp(Demp demp);
	void deleteDemp(int id);
	List<Demp> findAllDemp();
	List<Demp> findAllDempByPage(final int page,final int size);
}
