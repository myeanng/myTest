package com.ss.dao;

import java.util.List;

import com.ss.entity.Emp;

public interface EmpDao {
	void addEmp(Emp emp);
	void updateEmp(Emp emp);
	void deleteEmp(int id);
	List<Emp> findAllEmp();
	List<Emp> findAllEmpByPage(final int page,final int size);
	
}
