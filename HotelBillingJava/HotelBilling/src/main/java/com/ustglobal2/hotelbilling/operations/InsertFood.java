package com.ustglobal2.hotelbilling.operations;

import java.util.Scanner;

import com.ustglobal2.hotelbilling.beans.Hotel_Bill;
import com.ustglobal2.hotelbilling.mainservice.HotelService;

public class InsertFood {
	Scanner s=new Scanner(System.in);
	HotelService us = new HotelService();
	
	Hotel_Bill user = new Hotel_Bill();
	static HotelOperations ho=new HotelOperations();
	public void insertItem(Hotel_Bill b) {
		System.out.println("Enter the item code:");
		user.setItem_code(Integer.parseInt(s.nextLine()));
		System.out.println("Enter the food Name");
		user.setFood_name(s.nextLine());
		System.out.println("Enter the price");
		user.setPrice(Integer.parseInt(s.nextLine()));
		
	}
	public static void main(String[] args) {
		
		ho.addFoodItem();
		
		
		
		
	}

}
