package com.dev.inheritance;

public class Father extends GrandFather {

	static Father f= new Father();
	String name="Edderd"; // this variable is reinitialized of GrandFather.name here
	
	@Override 
	public void printName() {
//		String name="Edderd";
		
//		System.out.println(name+" "+f.name+" "+f.lastName);//output=>Eddard Eddard Stark boc reinitialization of name
		super.printName();//access the printName of grandFather
		System.out.println(name+" "+super.name+" "+f.lastName);//output=> Eddard  tohren stark
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f.printName();
	}

}
