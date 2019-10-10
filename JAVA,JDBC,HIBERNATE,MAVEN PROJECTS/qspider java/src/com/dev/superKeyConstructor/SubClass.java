package com.dev.superKeyConstructor;

public class SubClass extends SuperClass {

	public  SubClass() {
		//super(1);
		super("hdgf");
		System.out.println("no arg subclass");
	}
	
	public SubClass(int i) {
		super("ahg",2);
		System.out.println(" subclass arg int");
	}
	
	public SubClass(int i,String s) {
		super(3,"jgfyu");
		System.out.println("subclass arg int and string");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s=new SubClass();
		SubClass s1=new SubClass(2);
		SubClass s2=new SubClass(3,"asv");


	}

}
