package com.ss.aop;

import java.util.HashSet;
import java.util.Set;

import org.aspectj.lang.ProceedingJoinPoint;

public class S4Aop {
	private Set<String> cus=new HashSet<String>();
	public void qian(){
		System.out.println("��ʼת��...");
	}
	public void hou(){
		System.out.println("ת�����...");
	}
	public void yichang(){
		System.out.println("ת������...");
	}
}
