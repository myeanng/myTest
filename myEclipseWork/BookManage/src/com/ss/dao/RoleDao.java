package com.ss.dao;

import java.util.List;

import com.ss.entity.Role;

public interface RoleDao {
	int add(Role role);
	int del(int roleid);
	int upd(Role role);
	List<Role> queAll();
	boolean queName(String rolename);
}
