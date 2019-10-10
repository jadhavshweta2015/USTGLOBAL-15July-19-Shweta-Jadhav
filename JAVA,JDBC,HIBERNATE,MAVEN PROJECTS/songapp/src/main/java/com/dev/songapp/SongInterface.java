package com.dev.songapp;

import java.sql.Connection;

public interface SongInterface {
	public Connection getConnection();
	public void playSongs();
	public void searchSongs();
	public void showAllSongs();
	public void playAllSongs();
	public void songsRandom();
	public void perticluarSong();
	public void insertSong();
	public void editSong();
	public void deletesong();
	
}
