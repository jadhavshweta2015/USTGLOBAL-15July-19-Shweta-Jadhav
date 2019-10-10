package com.dev.methodOveriding;

public class Child extends Parent{
	@Override
	public void ParentAdd() {
		
		System.out.println("hello child with int arg");
	}
	/*@Override
	 void ParentAdd1() {                       //gives error bcause final method cannot be override
		// TODO Auto-generated constructor stub
		System.out.println("hello parent with no arg");
	}*/
	/*@Override
	 void ParentAdd2() {						//gives error because static method cannot be override
		// TODO Auto-generated constructor stub
		System.out.println("hello parent with no arg");
	}*/
	
	/*@Override
	 void ParentAdd3() {						//gives error because private method cannot be override
		// TODO Auto-generated constructor stub
		System.out.println("hello parent with no arg");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.ParentAdd();

	}

}
