package com.fxt.entity;

import java.io.Serializable;

public class Comment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cid;
	private int gid;
	private int uid;
	private String contents;
	private String time;
	public Comment(int cid, int gid, int uid, String contents, String time) {
		super();
		this.cid = cid;
		this.gid = gid;
		this.uid = uid;
		this.contents = contents;
		this.time = time;
	}
	public Comment() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
