package com.dev.superKeyConstructor;

public class SuperClass {

	public SuperClass() {
		// TODO Auto-generated constructor stub
		System.out.println("hello superclass");
	}
	public SuperClass(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("superclass arg int");

	}
	public SuperClass(int i ,String s) {
		// TODO Auto-generated constructor stub
		System.out.println("superclass arg int and string");

	}
	public SuperClass(String s,int i) {
		// TODO Auto-generated constructor stub
		System.out.println("superclass arg string and int");

	}
	public SuperClass(String s) {
		// TODO Auto-generated constructor stub
		System.out.println("superclass arg string");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass s1=new SuperClass();
	}

}
