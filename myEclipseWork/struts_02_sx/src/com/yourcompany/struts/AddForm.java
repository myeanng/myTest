package com.yourcompany.struts;

import org.apache.struts.action.ActionForm;

import com.sx.entity.Admin;

public class AddForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Admin admin=new Admin();
	private String rd;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public String getRd() {
		return rd;
	}
	public void setRd(String rd) {
		this.rd = rd;
	}
	

}
