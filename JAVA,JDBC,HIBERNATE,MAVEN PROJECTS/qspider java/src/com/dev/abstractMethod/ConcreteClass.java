package com.dev.abstractMethod;

public class ConcreteClass extends ParentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteClass c=new ConcreteClass();
		c.display();
		c.show();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		super.print();
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("parent method");
	}

}
