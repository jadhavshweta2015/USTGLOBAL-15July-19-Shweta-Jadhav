package com.dev.inheritance;

public class Daughter extends Father {
	
	static GrandFather d= new Daughter();
	
	@Override
	public void printName() {
	
		super.printName();//access the father printName method along with grandfather printName method bcoz grandfather printName is access in father
		String name="Sansa";
		System.out.println(name+" "+super.name+" "+d.lastName);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.printName();
	}

}
