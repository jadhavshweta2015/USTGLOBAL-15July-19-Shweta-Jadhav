package com.ustglobal2.hotelbilling.mainservice;

import java.util.Scanner;

import com.ustglobal2.hotelbilling.beans.Hotel_Bill;
import com.ustglobal2.hotelbilling.operations.HotelOperations;

public class HotelService {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HotelOperations hb=new HotelOperations();
		while(true) {
			int ch = 0;
			System.out.println("***********HotelBilling***************");
			System.out.println("1.Show all food items");
			System.out.println("2.Take order from cutomers");
			System.out.println("3.Operate onfood item");
			System.out.println("4.total bill of the day");
			System.out.println("Enter ur choice:");
			ch=s.nextInt();
			switch(ch) {
			case 1: 
				hb.showAllItems();
				break;
			case 2:
				hb.takeOrder();
				break;
			case 3:
				int op=0;
				while(op<=3) {
					System.out.println("****************");
					System.out.println("1.Add food item");
					System.out.println("2.Remove food item");
					System.out.println("3.Modify food item");
					System.out.println("Enter ur choice:");
					
					op=s.nextInt();
					switch(op) {
					case 1:	
						hb.addFoodItem();
						break;
					case 2:
						hb.removeFoodItem();
						   break;
					case 3:
						hb.modifyFoodItem();
						   break;
					default :
						break;
					}
				}
				break;
			case 4:
				hb.totalBilling();
				break;
			default:
				break;
			}
			}
	}

}
