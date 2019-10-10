package com.dev.exceptions;

public class CustomException extends Exception {

	public  CustomException() {
		System.out.println("Custom Exception");
	}
	public  CustomException(int i,int j) {
		System.out.println("Custom Exception with 2 int");
	}
	public  CustomException(int i) {
		System.out.println("Custom Exception with int");
	}
	
	public String getMessage() {
		return "get message is here";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
