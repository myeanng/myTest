package com.ppd.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ppd.dao.AccountDao;
import com.ppd.dao.BankDao;
import com.ppd.dao.BillDao;
import com.ppd.dao.CreditDao;
import com.ppd.dao.DueinDao;
import com.ppd.dao.LandingrecordDao;
import com.ppd.dao.LoanDao;
import com.ppd.dao.MessageDao;
import com.ppd.dao.ProtectDao;
import com.ppd.dao.QuestionDao;
import com.ppd.dao.RepaymentplanDao;
import com.ppd.dao.SafetyDao;
import com.ppd.dao.UserinfoDao;
import com.ppd.dao.UsersDao;
import com.ppd.entity.Account;
import com.ppd.entity.Bill;
import com.ppd.entity.Credit;
import com.ppd.entity.Duein;
import com.ppd.entity.Landingrecord;
import com.ppd.entity.Loan;
import com.ppd.entity.Message;
import com.ppd.entity.Protect;
import com.ppd.entity.Question;
import com.ppd.entity.Safety;
import com.ppd.entity.Userinfo;
import com.ppd.entity.Users;
import com.ppd.service.AaaService;


@Service("aaaService")
public class AaaServiceImpl implements AaaService {

	private AccountDao accountDao;
	private UsersDao usersDao;
	private CreditDao creditDao;
	private BillDao billDao;
	private BankDao bankDao;
	private DueinDao dueinDao;
	private LandingrecordDao landingrecordDao;
	private LoanDao loanDao;
	private MessageDao messageDao;
	private QuestionDao questionDao;
	private ProtectDao protectDao;
	private RepaymentplanDao repaymentplanDao;
	private SafetyDao safetyDao;
	private UserinfoDao userinfoDao;
	
	
	//Set注入Dao
	@Resource(name="userinfoDao")
	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}
	@Resource(name="accountDao")
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Resource(name="bankDao")
	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}	
	@Resource(name="billDao")
	public void setBillDao(BillDao billDao) {
		this.billDao = billDao;
	}
	@Resource(name="dueinDao")
	public void setDueinDao(DueinDao dueinDao) {
		this.dueinDao = dueinDao;
	}
	@Resource(name="landingrecordDao")
	public void setLandingrecordDao(LandingrecordDao landingrecordDao) {
		this.landingrecordDao = landingrecordDao;
	}
	@Resource(name="loanDao")
	public void setLoanDao(LoanDao loanDao) {
		this.loanDao = loanDao;
	}
	@Resource(name="messageDao")
	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}
	@Resource(name="protectDao")
	public void setProtectDao(ProtectDao protectDao) {
		this.protectDao = protectDao;
	}
	@Resource(name="questionDao")
	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}
	@Resource(name="repaymentplanDao")
	public void setRepaymentplanDao(RepaymentplanDao repaymentplanDao) {
		this.repaymentplanDao = repaymentplanDao;
	}
	@Resource(name="safetyDao")
	public void setSafetyDao(SafetyDao safetyDao) {
		this.safetyDao = safetyDao;
	}	
	@Resource(name="usersDao")
	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}
	@Resource(name="creditDao")
	public void setCreditDao(CreditDao creditDao) {
		this.creditDao = creditDao;
	}
	public List<Bill> uPaccount(Users users, double money) {
		// TODO Auto-generated method stub
		//查找账户信息
		Account account=accountDao.queryById(users.getUserid());
		//添加账单并判断是充值或提现
		if(money>0){
			//充值操作
			account.setAllmoney(account.getAllmoney()+money);
			account.setInmoney(account.getInmoney()+money);
			//添加记录
			Bill b=new Bill();
			
			//Set收入状态
			b.setClass_(2);
			//Set用户ID
			b.setUsers(users);
			//Set金额
			b.setMoney(money);
			b.setState("提现");
			//添加记录
			billDao.add(b);
			
		}
		if(money<0){
			//提现操作
			//收费标准(每笔3元)
			double sxf=-3;
			account.setAllmoney(account.getAllmoney()+money+sxf);
			account.setInmoney(account.getInmoney()+money+sxf);
			//添加记录
			Bill b=new Bill();
			//Set支出状态
			b.setClass_(1);
			//Set用户ID
			b.setUsers(users);
			//Set金额
			b.setMoney(-money);
			b.setState("提现");
			billDao.add(b);
			//Set手续费状态
			b.setClass_(0);
			//Set金额
			b.setMoney(-sxf);
			b.setState("提现手续费");
			billDao.add(b);
			
		}
		//修改账户余额
		accountDao.up(account);
		
		//返回资金记录
		return findBill(99,3,users.getUserid());
	}
	public List<Bill> findBill(int classType, int dateType, int userid) {
		// TODO Auto-generated method stub
		Bill bill=new Bill();
		Users user=new Users();
		user.setUserid(userid);
		bill.setUsers(user);
		bill.setClass_(classType);
		//判断时间
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c=Calendar.getInstance();
		switch(dateType){
			case 3:
				//三天以内
				c.add(Calendar.DATE, -3);
				break;
			case 7:
				//一周以内
				c.add(Calendar.DATE, -7);
				break;
			case 30:
				//一月以内
				c.add(Calendar.MONTH, -1);
				break;
			case 90:
				//三月以内
				c.add(Calendar.MONTH, -3);
				break;
			case 180:
				//六月以内
				c.add(Calendar.MONTH, -6);
				break;
			
		}
		//格式化
		Date date=new Date(c.getTimeInMillis());
		bill.setCreatetime(date);
		return billDao.queryByParam(bill);
	}
	public Map findUsersAccountDuein(int userid) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		//查找用户的信息
		Users user = usersDao.findUserDueinAccount(userid);
		map.put("user", user);
		//查询累计收益Money
		map.put("ljmoney", dueinDao.ljmoney(userid));
		//查询待收收益Money
		map.put("dsmoney", dueinDao.dsmoney(userid));
		//查询180天内的待收的Duein
		map.put("dueins", findDuein(1,180,userid));
		//查询计算累计收益率
		map.put("syl", dueinDao.syl(userid));//传入收益率
		//查询投资各种项目的数目(1.投资中;2.还款中;3.已完成)
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		m.put("id", userid);
		m.put("status", 1);
		map.put("dueinnum1", dueinDao.dueinNum(m));
		m.put("status", 2);
		map.put("dueinnum2", dueinDao.dueinNum(m));
		m.put("status", 3);
		map.put("dueinnum3", dueinDao.dueinNum(m));
		return map;
	}
	public Map findUsersAccountLoan(int userid) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		//联合查找用户基本信息,账户信息,借款信息
		Users user = usersDao.findUserLoanAccount(userid);
		map.put("user", user);
		//查找信誉额度
		Credit credit = creditDao.queryById(user.getCredit());
		map.put("credit", credit);
		//计算使用总额度
		map.put("loanmoney", loanDao.findLoanmoney(userid));
		return map;
	}
	public Users upUsers(Users users) {
		// TODO Auto-generated method stub
		usersDao.up(users);
		return usersDao.findUserLoanAccount(users.getUserid());
	}
	public Map aqzx(Users user) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		//查找认证
		map.put("safety", safetyDao.queryById(user.getUserid()));
		//查找安全问题
		Protect p=new Protect();
		p.setUsers(user);
		map.put("protects", protectDao.queryByParam(p));
		return map;
	}
	public List<Question> findQuestion() {
		// TODO Auto-generated method stub
		return questionDao.queryAll();
	}
	public List<Message> findMessage(Message message) {
		// TODO Auto-generated method stub
		return messageDao.queryByParam(message);
	}
	public Message findMessage(int messageid) {
		// TODO Auto-generated method stub
		//查询
		Message message=messageDao.queryById(messageid);
		//修改为已读状态
		message.setStatus(0);
		//修改
		messageDao.up(message);
		//返回
		return message;
	}
	public void upMessage(int messageid) {
		// TODO Auto-generated method stub
		Message message=new Message();
		message.setMessageid(messageid);
		//修改为删除状态
		message.setStatus(2);
		messageDao.up(message);
	}
	public Users findUserAndUserinfo(int userid) {
		// TODO Auto-generated method stub
		return usersDao.findUserAndUserinfo(userid);
	}
	public Userinfo findUserinfo(int userid) {
		// TODO Auto-generated method stub
		return userinfoDao.queryById(userid);
	}
	public void upUserinfo(Userinfo userinfo) {
		// TODO Auto-generated method stub
		userinfoDao.up(userinfo);
	}
	public List<Duein> findDuein(int classType, int dateType, int userid) {
		// TODO Auto-generated method stub
		Duein duein=new Duein();
		Users user=new Users();
		user.setUserid(userid);
		duein.setUsers(user);
		duein.setStatus(classType);
		//判断时间
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c=Calendar.getInstance();
		switch(dateType){
			case 3:
				//三天以内
				c.add(Calendar.DATE, -3);
				break;
			case 7:
				//一周以内
				c.add(Calendar.DATE, -7);
				break;
			case 30:
				//一月以内
				c.add(Calendar.MONTH, -1);
				break;
			case 90:
				//三月以内
				c.add(Calendar.MONTH, -3);
				break;
			case 180:
				//六月以内
				c.add(Calendar.MONTH, -6);
				break;
			
		}
		//格式化
		Date date=new Date(c.getTimeInMillis());
		duein.setShouldtime(date);
		return dueinDao.queryByParam(duein);
	}
	public List<Landingrecord> findLandingrecord(int userid) {
		// TODO Auto-generated method stub
		Users user = new Users();
		user.setUserid(userid);
		Landingrecord entity = new Landingrecord();
		entity.setUsers(user);
		return landingrecordDao.queryByParam(entity);
	}
	public List<Loan> findLoan(int userid, int status) {
		// TODO Auto-generated method stub
		Users user = new Users();
		user.setUserid(userid);
		Loan l=new Loan();
		l.setUsers(user);
		l.setStatus(status);
		return loanDao.queryByParam(l);
	}
	public void upSafety(Safety safety) {
		// TODO Auto-generated method stub
		safetyDao.up(safety);
	}
	
}
