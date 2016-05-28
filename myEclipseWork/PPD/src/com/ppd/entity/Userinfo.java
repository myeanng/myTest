package com.ppd.entity;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */

public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer userinfoid;
	private Users users;
	private String realname;
	private String ic;
	private String marriage;
	private String education;
	private String address;
	private String homephone;
	private String property;
	private String company;
	private Double worktime;
	private String workaddress;
	private String companyphone;
	private String department;
	private String job;

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(Users users, String realname, String ic, String marriage,
			String education, String address, String homephone,
			String property, String company, Double worktime,
			String workaddress, String companyphone, String department,
			String job) {
		this.users = users;
		this.realname = realname;
		this.ic = ic;
		this.marriage = marriage;
		this.education = education;
		this.address = address;
		this.homephone = homephone;
		this.property = property;
		this.company = company;
		this.worktime = worktime;
		this.workaddress = workaddress;
		this.companyphone = companyphone;
		this.department = department;
		this.job = job;
	}

	// Property accessors

	public Integer getUserinfoid() {
		return this.userinfoid;
	}

	public void setUserinfoid(Integer userinfoid) {
		this.userinfoid = userinfoid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getIc() {
		return this.ic;
	}

	public void setIc(String ic) {
		this.ic = ic;
	}

	public String getMarriage() {
		return this.marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomephone() {
		return this.homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Double getWorktime() {
		return this.worktime;
	}

	public void setWorktime(Double worktime) {
		this.worktime = worktime;
	}

	public String getWorkaddress() {
		return this.workaddress;
	}

	public void setWorkaddress(String workaddress) {
		this.workaddress = workaddress;
	}

	public String getCompanyphone() {
		return this.companyphone;
	}

	public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}