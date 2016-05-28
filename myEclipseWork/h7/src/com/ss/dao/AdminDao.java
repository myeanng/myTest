package com.ss.dao;

import com.ss.entity.Admin;

public interface AdminDao {
	void add(Admin admin);
	void update(Admin admin);
	Admin login(Admin admin);
}
