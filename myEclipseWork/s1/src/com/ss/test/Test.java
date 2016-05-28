package com.ss.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ss.dao.YP;
import com.ss.entity.DYJ;
import com.ss.entity.SxYP;
import com.ss.entity.XjYP;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*YP yp=(SxYP) context.getBean("sxyp");
		yp.printYP();
		yp=(XjYP) context.getBean("xjyp");
		yp.printYP();
		*/
		DYJ dyj=(DYJ) context.getBean("dyj");
		dyj.printString();
	}

}
