package ssm.springmvc.entity;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4520242086161073520L;
	private Integer userID;
	private String userName;
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}
	
}
