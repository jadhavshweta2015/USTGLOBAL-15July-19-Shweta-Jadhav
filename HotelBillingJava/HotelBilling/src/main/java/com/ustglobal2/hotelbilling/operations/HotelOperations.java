package com.ustglobal2.hotelbilling.operations;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal2.hotelbilling.beans.Hotel_Bill;
import com.ustglobal2.hotelbilling.dao.HotelBillInterface;



public class HotelOperations implements HotelBillInterface {

	public static void main(String[] args) {

	}
InsertFood i=new InsertFood();
Hotel_Bill bill=new Hotel_Bill();
	public void showAllItems() {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="from Hotel_Bill";
			Query query=entityManager.createQuery(jpql);
			List<Hotel_Bill> rs=query.getResultList();
			for (Hotel_Bill hotel : rs) {
				System.out.println("*****************************");
				System.out.println("Item Code:"+hotel.getItem_code());
				System.out.println("Item Food Name:"+hotel.getFood_name());
				System.out.println("Itemprice:"+hotel.getPrice());
			}
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
	}

	public void takeOrder() {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		Hotel_Bill hh=new Hotel_Bill();
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			 int code;
			 System.out.println("enter itemcode");
			 code=Integer.parseInt(s.nextLine());
			 while(code!=0) {
				 String jpql="from Hotel_Bill where item_code=:item_code";
					Query query=entityManager.createQuery(jpql);
					System.out.println("enter item code");
					int item_code=Integer.parseInt(s.nextLine());
					query.setParameter("item_code",item_code );
					List<Hotel_Bill> rs=query.getResultList();
					for (Hotel_Bill hotel : rs) {
						System.out.println("*****************************");
						System.out.println("Item Code:"+hotel.getItem_code());
						System.out.println("Item Food Name:"+hotel.getFood_name());
						System.out.println("Itemprice:"+hotel.getPrice());
					}
					
			 }
			 transaction.commit();
			
			
			/*transaction.begin();
			System.out.println("enter code:");
			int code=Integer.parseInt(s.nextLine());
			while(code!=0) {
				System.out.println("enter code:");
				hh.setItem_code(Integer.parseInt(s.nextLine()));
				System.out.println("enter name:");
				hh.setFood_name(s.nextLine());
				System.out.println("enter price:");
				hh.setPrice(s.nextDouble());
				entityManager.persist(hh);
				transaction.commit();
				System.out.println("insertrd");

			}
			System.out.println("dont press 0 until order finish");
			transaction.commit();*/
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
	}

	public void opearteOnFood() {
		
	}

	public void addFoodItem() {
	/*	EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		try {
			Hotel_Bill hb=new Hotel_Bill();
			hb.setItem_code(101);
			hb.setFood_name("Dosa");
			hb.setPrice(100);
			
			Hotel_Bill hb1=new Hotel_Bill();
			hb.setItem_code(102);
			hb.setFood_name("Pavbhaji");
			hb.setPrice(200);
			
			Hotel_Bill hb2=new Hotel_Bill();
			hb.setItem_code(103);
			hb.setFood_name("Chicken");
			hb.setPrice(300);
			
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			
			
			List<Hotel_Bill> l=new ArrayList<Hotel_Bill>();
			l.add(hb);
			l.add(hb1);
			l.add(hb2);
			
			entityManager.persist(hb);
			entityManager.persist(hb1);
			entityManager.persist(hb2);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		i.insertItem(bill);*/
		Connection con=null;
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		
		try {
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//get connection via driver
			
			String url="jdbc:mysql://localhost:3306/hotel_db?user=root&password=root";
			con=DriverManager.getConnection(url);
		
			
			//issue query via connection
			String query="INSERT INTO hotel_bill VALUES(?,?,?)";
			ps=con.prepareStatement(query);
			System.out.println("Enter item_code:");
			ps.setInt(1,Integer.parseInt(sc.nextLine()));
			
			System.out.println("Enter food_name:");
			ps.setString(2,sc.nextLine());
			
			System.out.println("Enter price:");
			ps.setInt(3,Integer.parseInt(sc.nextLine()));
			
			
			
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
	}

	public void removeFoodItem() {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="delete from Hotel_Bill where item_code=:item_code";
			Query query=entityManager.createQuery(jpql);
			System.out.println("Enter id:");
			int item_code=s.nextInt();
			query.setParameter("item_code", item_code);
			int rs=query.executeUpdate();
			if(rs>0) {
				System.out.println("item remove"+rs);
			}else {
				System.out.println("something went wrong");
			}
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		
	}

	public void modifyFoodItem() {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="update Hotel_Bill set food_name=:food_name where item_code=:item_code";
			Query query=entityManager.createQuery(jpql);
			
			System.out.println("Enter foodname:");
			String name=s.nextLine();
			query.setParameter("food_name", name);
			
			System.out.println("Enter id:");
			int code=s.nextInt();
			query.setParameter("item_code", code);
			
			int rs=query.executeUpdate();
			if(rs>0) {
				System.out.println("item modify"+rs);
			}else {
				System.out.println("something went wrong");
			}
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	public void totalBilling() {
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		Scanner s=new Scanner(System.in);
		try {
			entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			String jpql="select sum(price) from Hotel_Bill";
			Query query=entityManager.createQuery(jpql);
			List<Double> rs=query.getResultList();
			for (Double double1 : rs) {
				System.out.println("Item price:"+double1);
			}
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
