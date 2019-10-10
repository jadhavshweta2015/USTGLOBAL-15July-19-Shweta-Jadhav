package com.ustglobal.bean;

public class SongBean {

	private int Song_Id;
	private String Song_Title;
	private String Artist_Name;
	private String Album_name;
	private String Song_location;
	private String Description;

	public int getSong_Id() {
		return Song_Id;
	}

	public void setSong_Id(int song_Id) {
		Song_Id = song_Id;
	}

	public String getSong_Title() {
		return Song_Title;
	}

	public void setSong_Title(String song_Title) {
		Song_Title = song_Title;
	}

	public String getArtist_Name() {
		return Artist_Name;
	}

	public void setArtist_Name(String artist_Name) {
		Artist_Name = artist_Name;
	}

	public String getAlbum_name() {
		return Album_name;
	}

	public void setAlbum_name(String album_name) {
		Album_name = album_name;
	}

	public String getSong_location() {
		return Song_location;
	}

	public void setSong_location(String song_location) {
		Song_location = song_location;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
