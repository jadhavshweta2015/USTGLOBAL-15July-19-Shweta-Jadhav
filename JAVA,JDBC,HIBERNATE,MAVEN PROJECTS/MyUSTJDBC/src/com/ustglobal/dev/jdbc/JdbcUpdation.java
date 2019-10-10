package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcUpdation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Connection con=null;
		Statement s=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("Enter username and password");
			String username=sc.nextLine();
			String password=sc.nextLine();
			con=DriverManager.getConnection(url,username,password);
			System.out.println("connection estd...");
			System.out.println("***************************");
			
			String query2="select * from users_info";
			s=con.createStatement();
			ResultSet rs1=s.executeQuery(query2);
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
			
			String query="update users_info set email=? where userid=? and password=?";
			ps=con.prepareStatement(query);
			
			System.out.println("Enter new emailid:");
			ps.setString(1, sc.nextLine());
			
			System.out.println("Enter userid:");
			ps.setInt(2,Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter password:");
			ps.setString(3,sc.nextLine());
			
			int rs=ps.executeUpdate();
			
			//process resultset query via preaparedStatement
			if(rs>0) {
				System.out.println("Query ok,"+rs+"row affected");
				System.out.println("*************************");
			}else {
				System.out.println("something is wrong...");
			}
			
			String query3="select * from users_info";
			s=con.createStatement();
			ResultSet rs2=s.executeQuery(query3);
			while(rs2.next()) {
				int userid=rs2.getInt("userid");
				String username1=rs2.getString("username");
				String email=rs2.getString("email");
				String password1=rs2.getString("password");
				
				System.out.println("userid:"+userid);
				System.out.println("username:"+username1);
				System.out.println("email:"+email);
				System.out.println("passord:"+password1);
				System.out.println("*************************");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
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
