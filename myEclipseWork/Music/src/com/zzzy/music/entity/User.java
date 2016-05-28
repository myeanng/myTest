package com.zzzy.music.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="mt_user")
@SuppressWarnings("serial")
public class User implements Serializable {
	private Integer id;
	private String name;
	private String pwd;
	//多对多(用户收藏的音乐)
	private Set<Music> musics=new HashSet<Music>();
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	@ManyToMany
	public Set<Music> getMusics() {
		return musics;
	}
	public void setMusics(Set<Music> musics) {
		this.musics = musics;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
