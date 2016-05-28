package com.ss.biz.impl;

import java.util.List;

import com.ss.biz.BankBiz;
import com.ss.dao.AccountDao;
import com.ss.dao.RecordDao;
import com.ss.entity.Account;
import com.ss.entity.Record;

public class BankBizImpl implements BankBiz {
	private AccountDao ad;
	private RecordDao rd;
	
	public void add(Record record) {
		// TODO Auto-generated method stub
		rd.add(record);
	}

	public void add(Account account) {
		// TODO Auto-generated method stub
		ad.add(account);
	}

	public List<Account> findAccount() {
		// TODO Auto-generated method stub
		return ad.find();
	}

	public List<Record> findRecord() {
		// TODO Auto-generated method stub
		return rd.find();
	}

	public void update(Account account) {
		// TODO Auto-generated method stub
		ad.updateAccount(account);
	}

	//转账
	public String zz(int id, int toId, float money) throws Exception {
		// TODO Auto-generated method stub
		Account acc=ad.find(id);
		if(acc.getMoney()<money){
			return "余额不足!";
		}else{
			Account toacc=ad.find(toId);
			toacc.setMoney(money+toacc.getMoney());
			acc.setMoney(acc.getMoney()-money);
			ad.updateAccount(toacc);
			ad.updateAccount(acc);
			Record record=new Record();
			record.setFromaccount(acc);
			record.setToaccount(toacc);
			record.setRemark("转账");
			rd.add(record);
		}
		
		return "转账成功!";
	}

	public AccountDao getAd() {
		return ad;
	}

	public void setAd(AccountDao ad) {
		this.ad = ad;
	}

	public RecordDao getRd() {
		return rd;
	}

	public void setRd(RecordDao rd) {
		this.rd = rd;
	}
	

}
