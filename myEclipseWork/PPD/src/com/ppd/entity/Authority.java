package com.ppd.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */

public class Authority implements java.io.Serializable {

	// Fields

	private Integer authorityid;
	private Authority authority;
	private String authorityname;
	private String url;
	private String icon;
	private Integer superauthorityid;
	private List roles = new ArrayList(0);
	private List authorities = new ArrayList(0);

	// Constructors

	/** default constructor */
	public Authority() {
	}

	/** minimal constructor */
	public Authority(Authority authority) {
		this.authority = authority;
	}

	/** full constructor */
	public Authority(Authority authority, String authorityname, String url,
			String icon, Integer superauthorityid, List roles, List authorities) {
		this.authority = authority;
		this.authorityname = authorityname;
		this.url = url;
		this.icon = icon;
		this.superauthorityid = superauthorityid;
		this.roles = roles;
		this.authorities = authorities;
	}

	// Property accessors

	public Integer getAuthorityid() {
		return this.authorityid;
	}

	public void setAuthorityid(Integer authorityid) {
		this.authorityid = authorityid;
	}

	public Authority getAuthority() {
		return this.authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}

	public String getAuthorityname() {
		return this.authorityname;
	}

	public void setAuthorityname(String authorityname) {
		this.authorityname = authorityname;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSuperauthorityid() {
		return this.superauthorityid;
	}

	public void setSuperauthorityid(Integer superauthorityid) {
		this.superauthorityid = superauthorityid;
	}

	public List getRoles() {
		return this.roles;
	}

	public void setRoles(List roles) {
		this.roles = roles;
	}

	public List getAuthorities() {
		return this.authorities;
	}

	public void setAuthorities(List authorities) {
		this.authorities = authorities;
	}

}