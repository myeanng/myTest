package com.ppd.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer userid;
	private String username;
	private String tel;
	private String email;
	private String loginpassword;
	private String headpicture;
	private Date createtime;
	private Date lastlogintime;
	private String lastloginip;
	private Integer credit;
	private Integer integral;
	private Integer status;
	private List bills = new ArrayList(0);
	private List enterpriceinfos = new ArrayList(0);
	private List safeties = new ArrayList(0);
	private List userinfos = new ArrayList(0);
	private List rainbowinvests = new ArrayList(0);
	private List linkmans = new ArrayList(0);
	private List messagesForSenduserid = new ArrayList(0);
	private List messagesForTouserid = new ArrayList(0);
	private List accounts = new ArrayList(0);
	private List banks = new ArrayList(0);
	private List investrecords = new ArrayList(0);
	private List repaymentdetails = new ArrayList(0);
	private List repaymentplans = new ArrayList(0);
	private List dueins = new ArrayList(0);
	private List protects = new ArrayList(0);
	private List landingrecords = new ArrayList(0);
	private List loans = new ArrayList(0);
	private List materials = new ArrayList(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String username, String tel, String email,
			String loginpassword, String headpicture, Date createtime,
			Date lastlogintime, String lastloginip, Integer credit,
			Integer integral, Integer status, List bills, List enterpriceinfos,
			List safeties, List userinfos, List rainbowinvests, List linkmans,
			List messagesForSenduserid, List messagesForTouserid, List accounts,
			List banks, List investrecords, List repaymentdetails,
			List repaymentplans, List dueins, List protects, List landingrecords,
			List loans, List materials) {
		this.username = username;
		this.tel = tel;
		this.email = email;
		this.loginpassword = loginpassword;
		this.headpicture = headpicture;
		this.createtime = createtime;
		this.lastlogintime = lastlogintime;
		this.lastloginip = lastloginip;
		this.credit = credit;
		this.integral = integral;
		this.status = status;
		this.bills = bills;
		this.enterpriceinfos = enterpriceinfos;
		this.safeties = safeties;
		this.userinfos = userinfos;
		this.rainbowinvests = rainbowinvests;
		this.linkmans = linkmans;
		this.messagesForSenduserid = messagesForSenduserid;
		this.messagesForTouserid = messagesForTouserid;
		this.accounts = accounts;
		this.banks = banks;
		this.investrecords = investrecords;
		this.repaymentdetails = repaymentdetails;
		this.repaymentplans = repaymentplans;
		this.dueins = dueins;
		this.protects = protects;
		this.landingrecords = landingrecords;
		this.loans = loans;
		this.materials = materials;
	}

	// Property accessors

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginpassword() {
		return this.loginpassword;
	}

	public void setLoginpassword(String loginpassword) {
		this.loginpassword = loginpassword;
	}

	public String getHeadpicture() {
		return this.headpicture;
	}

	public void setHeadpicture(String headpicture) {
		this.headpicture = headpicture;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getLastlogintime() {
		return this.lastlogintime;
	}

	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}

	public String getLastloginip() {
		return this.lastloginip;
	}

	public void setLastloginip(String lastloginip) {
		this.lastloginip = lastloginip;
	}

	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List getBills() {
		return this.bills;
	}

	public void setBills(List bills) {
		this.bills = bills;
	}

	public List getEnterpriceinfos() {
		return this.enterpriceinfos;
	}

	public void setEnterpriceinfos(List enterpriceinfos) {
		this.enterpriceinfos = enterpriceinfos;
	}

	public List getSafeties() {
		return this.safeties;
	}

	public void setSafeties(List safeties) {
		this.safeties = safeties;
	}

	public List getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(List userinfos) {
		this.userinfos = userinfos;
	}

	public List getRainbowinvests() {
		return this.rainbowinvests;
	}

	public void setRainbowinvests(List rainbowinvests) {
		this.rainbowinvests = rainbowinvests;
	}

	public List getLinkmans() {
		return this.linkmans;
	}

	public void setLinkmans(List linkmans) {
		this.linkmans = linkmans;
	}

	public List getMessagesForSenduserid() {
		return this.messagesForSenduserid;
	}

	public void setMessagesForSenduserid(List messagesForSenduserid) {
		this.messagesForSenduserid = messagesForSenduserid;
	}

	public List getMessagesForTouserid() {
		return this.messagesForTouserid;
	}

	public void setMessagesForTouserid(List messagesForTouserid) {
		this.messagesForTouserid = messagesForTouserid;
	}

	public List getAccounts() {
		return this.accounts;
	}

	public void setAccounts(List accounts) {
		this.accounts = accounts;
	}

	public List getBanks() {
		return this.banks;
	}

	public void setBanks(List banks) {
		this.banks = banks;
	}

	public List getInvestrecords() {
		return this.investrecords;
	}

	public void setInvestrecords(List investrecords) {
		this.investrecords = investrecords;
	}

	public List getRepaymentdetails() {
		return this.repaymentdetails;
	}

	public void setRepaymentdetails(List repaymentdetails) {
		this.repaymentdetails = repaymentdetails;
	}

	public List getRepaymentplans() {
		return this.repaymentplans;
	}

	public void setRepaymentplans(List repaymentplans) {
		this.repaymentplans = repaymentplans;
	}

	public List getDueins() {
		return this.dueins;
	}

	public void setDueins(List dueins) {
		this.dueins = dueins;
	}

	public List getProtects() {
		return this.protects;
	}

	public void setProtects(List protects) {
		this.protects = protects;
	}

	public List getLandingrecords() {
		return this.landingrecords;
	}

	public void setLandingrecords(List landingrecords) {
		this.landingrecords = landingrecords;
	}

	public List getLoans() {
		return this.loans;
	}

	public void setLoans(List loans) {
		this.loans = loans;
	}

	public List getMaterials() {
		return this.materials;
	}

	public void setMaterials(List materials) {
		this.materials = materials;
	}

}