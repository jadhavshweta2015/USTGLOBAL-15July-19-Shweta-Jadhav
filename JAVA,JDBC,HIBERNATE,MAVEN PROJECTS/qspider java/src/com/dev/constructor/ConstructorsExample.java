package com.dev.constructor;

public class ConstructorsExample {

	public ConstructorsExample() {
		System.out.println("hello");
	}
	
	public ConstructorsExample(int i) {
		System.out.println("hello int");
	}
	
	public ConstructorsExample(String i) {
		System.out.println("hello string");
	}
	
	public ConstructorsExample(String s ,int i) {
		System.out.println("hello string and int");
	}
	
	public ConstructorsExample(int i,String s) {
		System.out.println("hello int and string and int");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorsExample c=new ConstructorsExample();
		System.out.println(c);
		ConstructorsExample c1=new ConstructorsExample(1);
		ConstructorsExample c2=new ConstructorsExample("String");
		ConstructorsExample c3=new ConstructorsExample("String",1);
		ConstructorsExample c4=new ConstructorsExample(1,"String");

	}

}
