package com.ss.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ss.dao.BingXangDao;

public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		BingXangDao bx=(BingXangDao) ac.getBean("bximpl");
		bx.goumai(2);
	}

}
