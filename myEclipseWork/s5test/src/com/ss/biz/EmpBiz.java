package com.ss.biz;

import java.util.List;

import com.ss.entity.Emp;

public interface EmpBiz {
	void addEmp(Emp emp);
	void updateEmp(Emp emp);
	List<Emp> findAllEmp();
}
