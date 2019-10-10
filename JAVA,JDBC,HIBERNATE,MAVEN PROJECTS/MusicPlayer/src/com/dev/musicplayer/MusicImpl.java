package com.dev.musicplayer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class MusicImpl implements MusicInterface {
	private static final String url ="jdbc:mysql://localhost:3306/ust_ty_db";
	private static final Properties prop = null;
	
	static Scanner sc= new Scanner(System.in);
	static PreparedStatement ps=null;
	static Scanner s=new Scanner(System.in);
	static Connection con=null;
	Statement	stmt=null;
	ResultSet	rs=null;
	

	@Override
	public void playSongs() {
		// TODO Auto-generated method stub
		
	}

	@Override
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

	@Override
	public void showAllSongs() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.showAll");
//			String query="select * from MusicFiles";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
//				int Song_Id=rs.getInt("Song_Id");
				String Songs_Title=rs.getString("Songs_Title");
//				String Artist_Name=rs.getString("Artist_Name");
//				String Album_Name=rs.getString("Album_Name");
//				String Song_Location=rs.getString("Song_Location");
//				String Description=rs.getString("Description");

			//	System.out.println("Song_Id:"+Song_Id);
				System.out.println("Songs_Title:"+Songs_Title);
//				System.out.println("Artist_Name:"+Artist_Name);
//				System.out.println("Album_Name:"+Album_Name);
//				System.out.println("Song_Location:"+Song_Location);
//				System.out.println("Description:"+Description);

				System.out.println("*************************");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void playAllSongs() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.showAll");
//			String query="select * from MusicFiles";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				int Song_Id=rs.getInt("Song_Id");
				String Songs_Title=rs.getString("Songs_Title");
				String Artist_Name=rs.getString("Artist_Name");
				String Album_Name=rs.getString("Album_Name");
				String Song_Location=rs.getString("Song_Location");
				String Description=rs.getString("Description");

				System.out.println(Song_Id+" playing.......");
				System.out.println("Song_Id:"+Song_Id);
				System.out.println("Songs_Title:"+Songs_Title);
				System.out.println("Artist_Name:"+Artist_Name);
				System.out.println("Album_Name:"+Album_Name);
				System.out.println("Song_Location:"+Song_Location);
				System.out.println("Description:"+Description);
				System.out.println("************************");

		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
	}

	@Override
	public void songsRandom() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.random");

//			String query="select * from MusicFiles order by RAND() LIMIT 1";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()) {
				int Song_Id=rs.getInt("Song_Id");
				String Songs_Title=rs.getString("Songs_Title");
				String Artist_Name=rs.getString("Artist_Name");
				String Album_Name=rs.getString("Album_Name");
				String Song_Location=rs.getString("Song_Location");
				String Description=rs.getString("Description");

				System.out.println("Song_Id:"+Song_Id);
				System.out.println("Songs_Title:"+Songs_Title);
				System.out.println("Artist_Name:"+Artist_Name);
				System.out.println("Album_Name:"+Album_Name);
				System.out.println("Song_Location:"+Song_Location);
				System.out.println("Description:"+Description);
				System.out.println("************************");

		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
	}		
	

	@Override
	public void perticluarSong() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.perticular");

//			String query="select * from MusicFiles where Song_Id=?";
			ps=con.prepareStatement(query);
			System.out.println("enter song id:");
			ps.setInt(1,Integer.parseInt(s.nextLine()));
			rs=ps.executeQuery();
			while(rs.next()) {
				int Song_Id=rs.getInt("Song_Id");
				String Songs_Title=rs.getString("Songs_Title");
				String Artist_Name=rs.getString("Artist_Name");
				String Album_Name=rs.getString("Album_Name");
				String Song_Location=rs.getString("Song_Location");
				String Description=rs.getString("Description");

				System.out.println("Song_Id:"+Song_Id);
				System.out.println("Songs_Title:"+Songs_Title);
				System.out.println("Artist_Name:"+Artist_Name);
				System.out.println("Album_Name:"+Album_Name);
				System.out.println("Song_Location:"+Song_Location);
				System.out.println("Description:"+Description);
				System.out.println("************************");
				
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				

}

	@Override
	public void insertSong() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.insert");

//			String query="INSERT INTO MusicFiles VALUES(?,?,?,?,?,?)";
			ps=con.prepareStatement(query);
			System.out.println("enter song id:");
			ps.setInt(1,Integer.parseInt(s.nextLine()));
			System.out.println("Enter  song title:");
			ps.setString(2, sc.nextLine());
			
			System.out.println("Enter  song Artist_Name:");
			ps.setString(3, sc.nextLine());
			System.out.println("Enter  song Album_Name:");
			ps.setString(4, sc.nextLine());
			System.out.println("Enter  song Song_Location:");
			ps.setString(5, sc.nextLine());
			System.out.println("Enter  song Description:");
			ps.setString(6, sc.nextLine());
			int rs1=ps.executeUpdate();
			if(rs1>0) {
				System.out.println("Query ok,"+rs1+"row affected");
				System.out.println("*************************");
			}else {
				System.out.println("something is wrong...");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}

	@Override
	public void editSong() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.edit");

//			String query="update MusicFiles set Songs_Title=? where Song_Id=? ";
			ps=con.prepareStatement(query);
			
			System.out.println("Enter new song title:");
			ps.setString(1, sc.nextLine());
			System.out.println("enter song id:");
			ps.setInt(2,Integer.parseInt(s.nextLine()));
			int rs1=ps.executeUpdate();
			if(rs1>0) {
				System.out.println("Query ok,"+rs1+"row affected");
				System.out.println("*************************");
			}else {
				System.out.println("something is wrong...");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}

	@Override
	public void deletesong() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/MusicPlayer";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			con=DriverManager.getConnection(url,prop);
			String query=prop.getProperty("my.delete");

//			String query="delete from MusicFiles where Song_Id=?";
			ps=con.prepareStatement(query);
			System.out.println("enter song id:");
			ps.setInt(1,Integer.parseInt(s.nextLine()));
			
			int rs1=ps.executeUpdate();
			if(rs1>0) {
				System.out.println("Query ok,"+rs1+"row affected");
				System.out.println("deleted");
				System.out.println("*************************");
			}else {
				System.out.println("something is wrong...");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		
	}
}
