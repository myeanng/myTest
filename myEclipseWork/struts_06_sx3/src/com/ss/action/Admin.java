package com.ss.action;

public class Admin {
private int id;
private String name;
private String pwd;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public Admin(int id, String name, String pwd) {
	super();
	this.id = id;
	this.name = name;
	this.pwd = pwd;
}
public Admin() {
	super();
}
public Admin(String name, String pwd) {
	super();
	this.name = name;
	this.pwd = pwd;
}

}
