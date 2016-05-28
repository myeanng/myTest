package com.zzzy.music.dao;

import java.util.List;

import com.zzzy.music.entity.Music;

public interface MusicDao {
	void addMusic(Music music);
	void updateMusic(Music music);
	void deleteMusic(int id);
	Music findMusic(int id);
	List<Music> findAllMusic();
	List<Music> findAllMusicByPage();
}
