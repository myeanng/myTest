package com.yourcompany.struts;

import org.apache.struts.action.ActionForm;

public class LonginForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String logname;
	private String logpwd;
	public String getLogname() {
		return logname;
	}
	public void setLogname(String logname) {
		this.logname = logname;
	}
	public String getLogpwd() {
		return logpwd;
	}
	public void setLogpwd(String logpwd) {
		this.logpwd = logpwd;
	}
	

}
