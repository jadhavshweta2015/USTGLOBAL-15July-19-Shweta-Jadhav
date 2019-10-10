package com.dev.staticnonstatic;

public class A {
	
	public static int area=0;// static variable in only declared in class not in main or method
	static A aa=new A();
	
	public static int areaSquare(int a) {
		//int square=a*a;
		//return square;
		
		int j=aa.areaRec(2, 4);//u can use this bcoz ur object is static in class not main , so non static member is access using object
		System.out.println("area of rectangle"+j);
		
		area=a*a;// this is static variable so u can use it without object
		return area;
	}
	
	public int areaRec(int len,int width) {
		//int rec=len*width;
		//return int;
		
//		int jj=areaSquare(2); // bcoz this is static method
//		System.out.println("area of squre"+jj);
		
		area=len*width;
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int area1=areaSquare(2);//we can access static member within class without creating object
		System.out.println(area1);
		
		
		int area2=aa.areaRec(2, 4);//we can access non static member with object 
		System.out.println(area2);
		
	}

}
