package com.ustglobal2.hotelbilling.dao;

import com.ustglobal2.hotelbilling.beans.Hotel_Bill;

public interface HotelBillInterface {
	public void showAllItems();
	public void takeOrder();
	public void opearteOnFood();
	public void addFoodItem();
	public void removeFoodItem();
	public void modifyFoodItem();
	public void totalBilling();
}
