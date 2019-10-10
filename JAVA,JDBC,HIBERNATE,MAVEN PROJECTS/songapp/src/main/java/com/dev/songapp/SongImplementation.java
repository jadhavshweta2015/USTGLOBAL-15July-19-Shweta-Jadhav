package com.dev.songapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class SongImplementation implements SongInterface {
	
	static Scanner sc= new Scanner(System.in);
	static PreparedStatement ps=null;
	static Scanner s=new Scanner(System.in);
	static Connection con=null;
	Statement	stmt=null;
	ResultSet	rs=null;
	public Connection getConnection() {
		if(con==null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/MusicPlayer";
				String path="C:\\Users\\SHweta\\Documents\\db.properties";
				FileReader reader=new FileReader(path);
				
				Properties prop=new Properties();
				prop.load(reader);
				con=DriverManager.getConnection(url,prop);
			}catch(Exception e) {
				
			}
		}
		return con;
	}

	public void playSongs() {
		// TODO Auto-generated method stub
		
	}

	public void searchSongs() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.search");
//			String query="select * from MusicFiles where Song_Title=?";
			ps=con.prepareStatement(query);
			System.out.println("Enter  song title:");
			String name=s.next();
			ps.setString(1,"%"+name+"%");
			rs=ps.executeQuery();
			int n=0;
			while(rs.next()) {
				int Song_Id=rs.getInt("Song_Id");
				String Songs_Title=rs.getString("Songs_Title");
				String Artist_Name=rs.getString("Artist_Name");
				String Album_Name=rs.getString("Album_Name");
				String Song_Location=rs.getString("Song_Location");
				String Description=rs.getString("Description");

				System.out.println("song found.......");
				System.out.println("Song_Id:"+Song_Id);
				System.out.println("Songs_Title:"+Songs_Title);
				System.out.println("Artist_Name:"+Artist_Name);
				System.out.println("Album_Name:"+Album_Name);
				System.out.println("Song_Location:"+Song_Location);
				System.out.println("Description:"+Description);
				System.out.println("************************");
				n=1;
		}
			if(n==1) {
				
			}else {
				System.out.println("song not found");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
		
		
	}

	public void showAllSongs() {
		// TODO Auto-generated method stub
		
	}

	public void playAllSongs() {
		// TODO Auto-generated method stub
		
	}

	public void songsRandom() {
		// TODO Auto-generated method stub
		
	}

	public void perticluarSong() {
		// TODO Auto-generated method stub
		
	}

	public void insertSong() {
		// TODO Auto-generated method stub
		
	}

	public void editSong() {
		// TODO Auto-generated method stub
		
	}

	public void deletesong() {
		// TODO Auto-generated method stub
		
	}

	
}
