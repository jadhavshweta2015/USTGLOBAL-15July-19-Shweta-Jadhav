package com.dev.abstractMethod;

public abstract class AbstractMethod {
	
	AbstractMethod(){
		System.out.println("u can have constructor for abstract class");
	}
	
	abstract void diplay();
	
	public void print() {
		System.out.println("Concrete method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AbstractMethod a=new AbstractMethod(); // u cant create object fro abstract class
	}

}
