package com.dev.staticnonstatic;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area1=A.areaSquare(2);//static member using class name
		System.out.println(area1);
		
		A aa=new A();
		int area2=aa.areaSquare(2);//nonstatic using object
		System.out.println(area2);
	}

}
