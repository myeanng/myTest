package com.zzzy.music.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="mt_tip")
@SuppressWarnings("serial")
public class Tip implements Serializable {
	private Integer id;
	//分享消息的提示
	private String tipvalue;
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTipvalue() {
		return tipvalue;
	}
	public void setTipvalue(String tipvalue) {
		this.tipvalue = tipvalue;
	}
	public Tip() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
