package com.dev.abstractMethod;

public class ConcreteChildAbstract extends ChildAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteChildAbstract c=new ConcreteChildAbstract();
		c.display();
		c.show();
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("show method of parent");
	}

}
