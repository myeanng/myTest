package com.zzzy.music.dao;

import java.util.List;

import com.zzzy.music.entity.Tip;

public interface TipDao {
	void addTip(Tip tip);
	void updateTip(Tip tip);
	void deleteTip(int id);
	Tip findTip(int id);
	List<Tip> findAllTip();
	List<Tip> findAllTipByPage();
}
