package com.ss.entity;

import com.ss.dao.MH;
import com.ss.dao.ZZ;

public class DYJ {
	private MH mh;
	private ZZ zz;
	
	public MH getMh() {
		return mh;
	}
	public void setMh(MH mh) {
		this.mh = mh;
	}
	public ZZ getZz() {
		return zz;
	}
	public void setZz(ZZ zz) {
		this.zz = zz;
	}
	public DYJ() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DYJ(MH mh, ZZ zz) {
		super();
		this.mh = mh;
		this.zz = zz;
	}
	public void printString(){
		mh.printString();
		zz.printString();
		
	}
	
}
