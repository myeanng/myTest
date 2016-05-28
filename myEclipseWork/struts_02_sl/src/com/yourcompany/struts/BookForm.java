package com.yourcompany.struts;

import java.io.UnsupportedEncodingException;

import org.apache.struts.action.ActionForm;

public class BookForm extends ActionForm {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String keywords;
private String rd;
public String getKeywords() {
	return keywords;
}
public void setKeywords(String keywords)throws UnsupportedEncodingException {
	this.keywords = new String(keywords.getBytes("iso-8859-1"),"utf-8");
}
public String getRd() {
	return rd;
}
public void setRd(String rd) {
	this.rd = rd;
}

}
