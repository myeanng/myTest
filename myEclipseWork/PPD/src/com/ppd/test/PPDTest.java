package com.ppd.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ppd.dao.AccountDao;
import com.ppd.dao.BankDao;
import com.ppd.dao.impl.AccountDaoImpl;
import com.ppd.dao.impl.BankDaoImpl;
import com.ppd.entity.Account;
import com.ppd.entity.Bank;
import com.ppd.entity.Bill;
import com.ppd.entity.Users;

public class PPDTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ApplicationContext app = new ClassPathXmlApplicationContext("applicationDataSource.xml","springMVC.xml");
		BankDao bd = (BankDaoImpl) app.getBean("bankDao");
		AccountDao ad=(AccountDaoImpl) app.getBean("accountDao");
		Users u=new Users();
		u.setUserid(1);
		
		Bank b1=new Bank(u,"123456789","ZGYH",new Date(),0);
		b1.setBankcardid(2);
		//bd.add(b1);
		//System.out.println("addBank...");
		bd.up(b1);
		System.out.println("upBank...");
		Account a=new Account();
		a.setAccountid(1);
		a.setAccountpassword("555");
		ad.up(a);
		System.out.println("upAccount...");*/
		/*String str="11111111111";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb);
		sb.replace(3, 12, "****");
		System.out.println(sb);
		str=sb.toString();
		System.out.println(str);*/
		Double money=300.0;
		money=-money;
		System.out.println(money);
		
		
	}

}
