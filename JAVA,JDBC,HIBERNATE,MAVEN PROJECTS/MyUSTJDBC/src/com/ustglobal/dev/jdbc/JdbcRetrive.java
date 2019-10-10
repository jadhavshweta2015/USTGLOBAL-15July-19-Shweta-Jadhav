package com.ustglobal.dev.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcRetrive {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection con=null;
		//Statement s=null;
		PreparedStatement ps=null;
		ResultSet rs1=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			String path="C:\\Users\\SHweta\\Documents\\db.properties";
			
			FileReader reader=new FileReader(path);
			
			Properties prop=new Properties();
			prop.load(reader);
			
			con=DriverManager.getConnection(url,prop);
			System.out.println("connection estd...");
			System.out.println("***************************");
			
			String query="select * from users_info where userid=?";
			ps=con.prepareStatement(query);
			
			System.out.println("Enter id:");
			ps.setInt(1,Integer.parseInt(sc.nextLine()));
			
			rs1=ps.executeQuery();
			while(rs1.next()) {
				int userid=rs1.getInt("userid");
				String username1=rs1.getString("username");
				String email=rs1.getString("email");
				String password1=rs1.getString("password");
				
				System.out.println("userid:"+userid);
				System.out.println("username:"+username1);
				System.out.println("email:"+email);
				System.out.println("passord:"+password1);
				System.out.println("*************************");
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	}
	}
