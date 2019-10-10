package com.dev.polymorphism;

public class CompileTimePoly {

	public void addition() {
		int a=1,b=1,c;
		c=a+b;
		System.out.println("addition :"+c);
	}
	public void addition( int i,int j) {
		int k=i+j;
		System.out.println("2 addtion:"+k);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTimePoly p=new CompileTimePoly();
		p.addition();
		p.addition(2, 3);
	}

}
