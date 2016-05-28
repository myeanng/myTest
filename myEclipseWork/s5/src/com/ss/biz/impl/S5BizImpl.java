package com.ss.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ss.biz.S5Biz;
import com.ss.dao.DempDao;
import com.ss.dao.EmpDao;
import com.ss.entity.Demp;
import com.ss.entity.Emp;
@Service("s5biz")
public class S5BizImpl implements S5Biz {
	@Autowired
	private EmpDao ed;
	@Autowired
	private DempDao dd;
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor={java.lang.Exception.class})
	public void addDemp(Demp demp) {
		// TODO Auto-generated method stub
		dd.addDemp(demp);
	}
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor={java.lang.Exception.class})
	public void addEmp(Emp emp) {
		// TODO Auto-generated method stub
		ed.addEmp(emp);
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor={java.lang.Exception.class})
	public void deleteDemp(int id) {
		// TODO Auto-generated method stub
		dd.deleteDemp(id);
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor={java.lang.Exception.class})
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		ed.deleteEmp(id);
	}
	
	@Transactional(readOnly=true)
	public List<Demp> findAllDemp() {
		// TODO Auto-generated method stub
		return dd.findAllDemp();
	}
	
	@Transactional(readOnly=true)
	public List<Demp> findAllDempByPage(int page, int size) {
		// TODO Auto-generated method stub
		return dd.findAllDempByPage(page, size);
	}
	
	@Transactional(readOnly=true)
	public List<Emp> findAllEmp() {
		// TODO Auto-generated method stub
		return ed.findAllEmp();
	}
	
	@Transactional(readOnly=true)
	public List<Emp> findAllEmpByPage(int page, int size) {
		// TODO Auto-generated method stub
		return ed.findAllEmpByPage(page, size);
	}

	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor={java.lang.Exception.class})
	public void updateDemp(Demp demp) {
		// TODO Auto-generated method stub
		dd.updateDemp(demp);
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

	public DempDao getDd() {
		return dd;
	}

	public void setDd(DempDao dd) {
		this.dd = dd;
	}
	
	

}
