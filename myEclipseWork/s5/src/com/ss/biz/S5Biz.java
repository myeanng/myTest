package com.ss.biz;

import java.util.List;

import com.ss.entity.Demp;
import com.ss.entity.Emp;

public interface S5Biz {
	void addEmp(Emp emp);
	void updateEmp(Emp emp);
	void deleteEmp(int id);
	List<Emp> findAllEmp();
	List<Emp> findAllEmpByPage(final int page,final int size);
	void addDemp(Demp demp);
	void updateDemp(Demp demp);
	void deleteDemp(int id);
	List<Demp> findAllDemp();
	List<Demp> findAllDempByPage(final int page,final int size);
}
