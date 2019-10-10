package com.dev.abstractMethod;

public class Abstraction extends AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction a=new Abstraction();
		a.diplay();
		a.print();
	}

	@Override
	void diplay() {
		super.print();
		System.out.println("this is implemented abstract method");
		
	}

}
