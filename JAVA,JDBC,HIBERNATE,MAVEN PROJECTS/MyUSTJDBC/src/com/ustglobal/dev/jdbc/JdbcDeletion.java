package com.ustglobal.dev.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Connection con=null;
		PreparedStatement ps=null;
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
			
			String query="delete from users_info where userid=? and password=?";
			ps=con.prepareStatement(query);
			
			System.out.println("Enter id:");
			ps.setInt(1,Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter password:");
			ps.setString(2, sc.nextLine());
			
			int rs=ps.executeUpdate();
			if(rs>0) {
				System.out.println("Query ok,"+rs+"row affected");
			}else {
				System.out.println("something is wrong...");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
