package com.fxt.entity;

import java.io.Serializable;

public class Pay implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pid;
	private int uid;
	private float balance;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Pay() {
		super();
	}
	public Pay(int pid, int uid, float balance) {
		super();
		this.pid = pid;
		this.uid = uid;
		this.balance = balance;
	}
	

}
