package com.dev.inheritance;

public class GrandFather {
	
	String lastName="Stark";
	String name="Torrhen";
	
	static GrandFather gf=new GrandFather();
	
	
	public void printName() {
		
		System.out.println(name+" "+this.lastName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		gf.printName();
	}

}
