package com.ss.dao;

import java.util.List;

import com.ss.entity.Publisher;

public interface PublisherDao {
	int add(Publisher publisher);
	int del(int publisherid);
	int upd(Publisher publisher);
	List<Publisher> queAll();
	boolean queName(String publishername);
}
