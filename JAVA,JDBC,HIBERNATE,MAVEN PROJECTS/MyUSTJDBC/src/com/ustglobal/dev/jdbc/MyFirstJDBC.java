package com.ustglobal.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBC {

	
	
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		//load driver
		try {
			java.sql.Driver div=new Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver loaded....");
			
			//get connection via driver
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			
			con=DriverManager.getConnection(dbUrl);
			System.out.println("conection estd");
			System.out.println("*****************************");
			
			//issue sql query via connection
			String query="select * from users_info";
			stmt=con.createStatement();
			rs=stmt.executeQuery(query);
			
			//process the result returned by sql query
			while(rs.next()) {
				int userid=rs.getInt("userid");
				String username=rs.getString("username");
				String email=rs.getString("email");
				String password=rs.getString("password");
				
				System.out.println("userid:"+userid);
				System.out.println("username:"+username);
				System.out.println("email:"+email);
				System.out.println("passord:"+password);
				System.out.println("*************************");
			}
		} catch (SQLException e) {
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
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}
