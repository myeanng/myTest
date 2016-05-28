package com.ss.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ss.biz.EmpBiz;
import com.ss.dao.EmpDao;
import com.ss.entity.Emp;

@Service("eb")
public class EmpBizImpl implements EmpBiz {
	@Autowired
	private EmpDao ed;
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor={java.lang.Exception.class})
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		ed.addEmp(emp);
	}
	@Transactional(readOnly=true)
	public List<Emp> findAllEmp() {
		// TODO Auto-generated method stub
		return ed.findAllEmp();
	}
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor={java.lang.Exception.class})
	public void updateEmp(Emp emp) {
		// TODO Auto-generated method stub
		ed.updateEmp(emp);
	}

	public EmpDao getEd() {
		return ed;
	}

	public void setEd(EmpDao ed) {
		this.ed = ed;
	}
	
}
