package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcInsertion {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			
			//get connection via driver
			System.out.println("Enter username and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection estd");
			
			//issue query via connection
			String query="INSERT INTO USERS_INFO VALUES(?,?,?,?)";
			ps=con.prepareStatement(query);
			System.out.println("Enter user id:");
			ps.setInt(1,Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter username:");
			ps.setString(2,sc.nextLine());
			
			System.out.println("Enter email:");
			ps.setString(3,sc.nextLine());
			
			System.out.println("Enter password:");
			ps.setString(4,sc.nextLine());
			
			int rs=ps.executeUpdate();
			
			//process resultset query via preaparedStatement
			if(rs>0) {
				System.out.println("Query ok,"+rs+"row affected");
			}else {
				System.out.println("something is wrong...");
			}
			
			
		} catch ( Exception e) {
			System.out.println("something is wrong...");
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
