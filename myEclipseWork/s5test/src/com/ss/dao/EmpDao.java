package com.ss.dao;

import java.util.List;

import com.ss.entity.Emp;

public interface EmpDao {
	void addEmp(Emp emp);
	void updateEmp(Emp emp);
	List<Emp> findAllEmp();
}
