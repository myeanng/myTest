package com.fxt.entity;

import java.io.Serializable;

public class Users implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private	int uid;
	private String username;
	private String userpwd;
	private String tel;
	private int grade;
	private float money;
	private String createtime;
	private int isadmin;
	private int status;
	private String address;
	private String sex;
	private String birthday;
	private String shenfen;
	private String hunyinstatus;
	private String xingqu;
	private String pic;
	
	public Users(String username, String userpwd, int isadmin, int status) {
		super();
		this.username = username;
		this.userpwd = userpwd;
		this.isadmin = isadmin;
		this.status = status;
	}
	
	public Users(int uid, String username, String tel, int grade, float money,
			String createtime, int status) {
		super();
		this.uid = uid;
		this.username = username;
		this.tel = tel;
		this.grade = grade;
		this.money = money;
		this.createtime = createtime;
		this.status = status;
	}

	
	public Users(int uid, String username, String userpwd, String tel,String address,
			int isadmin) {
		super();
		this.uid = uid;
		this.username = username;
		this.userpwd = userpwd;
		this.tel = tel;
		this.address = address;
		this.isadmin = isadmin;
		
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public int getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(int isadmin) {
		this.isadmin = isadmin;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getShenfen() {
		return shenfen;
	}

	public void setShenfen(String shenfen) {
		this.shenfen = shenfen;
	}

	public String getHunyinstatus() {
		return hunyinstatus;
	}

	public void setHunyinstatus(String hunyinstatus) {
		this.hunyinstatus = hunyinstatus;
	}

	public String getXingqu() {
		return xingqu;
	}

	public void setXingqu(String xingqu) {
		this.xingqu = xingqu;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Users() {
		super();
	}
	public Users(int uid, String username, String userpwd, String tel,
			int grade, float money, String createtime, int isadmin, int status) {
		super();
		this.uid = uid;
		this.username = username;
		this.userpwd = userpwd;
		this.tel = tel;
		this.grade = grade;
		this.money = money;
		this.createtime = createtime;
		this.isadmin = isadmin;
		this.status = status;
	}

	public Users(int uid, String username, String userpwd) {
		super();
		this.uid = uid;
		this.username = username;
		this.userpwd = userpwd;
	}

	public Users(int uid, String username, String userpwd, String tel,
			int grade, float money, String createtime, int isadmin, int status,
			String address, String sex, String birthday, String shenfen,
			String hunyinstatus, String xingqu, String pic) {
		super();
		this.uid = uid;
		this.username = username;
		this.userpwd = userpwd;
		this.tel = tel;
		this.grade = grade;
		this.money = money;
		this.createtime = createtime;
		this.isadmin = isadmin;
		this.status = status;
		this.address = address;
		this.sex = sex;
		this.birthday = birthday;
		this.shenfen = shenfen;
		this.hunyinstatus = hunyinstatus;
		this.xingqu = xingqu;
		this.pic = pic;
	}

	public Users(int uid, String username, String userpwd, String tel,
			String address) {
		super();
		this.uid = uid;
		this.username = username;
		this.userpwd = userpwd;
		this.tel = tel;
		this.address = address;
	}

	public Users(int uid, String username, String tel, int grade, float money,
			String createtime, String address, String sex, String birthday,
			String shenfen, String hunyinstatus, String xingqu, String pic) {
		super();
		this.uid = uid;
		this.username = username;
		this.tel = tel;
		this.grade = grade;
		this.money = money;
		this.createtime = createtime;
		this.address = address;
		this.sex = sex;
		this.birthday = birthday;
		this.shenfen = shenfen;
		this.hunyinstatus = hunyinstatus;
		this.xingqu = xingqu;
		this.pic = pic;
	}
	
	
}
