package com.dev.arrays;

public class CreatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArr=new char[20];
		byte[] byteArr=new byte[10];
		
		int[] intArr=new int[10];//declaration & creation
		System.out.println("int arr"+intArr);//intArr is reference so it take the physical address of int object
		intArr[0]=1;	//initialzation
		intArr[1]=2;
		intArr[2]=3;
		intArr[3]=4;
		intArr[4]=5;
		
		int arr2[]= {1,24,3,4};
		System.out.println("Array2="+arr2[1]);
		System.out.println("Array2 length="+arr2.length);
		int aa= arr2.length/2;
		System.out.println("Array2 middle="+aa+" element="+arr2[aa]);

		
		
		charArr[0]='A';
		charArr[1]='B';
		charArr[2]='C';
		charArr[3]='D';
		
		byteArr[0]=11;
		byteArr[1]=22;
		byteArr[2]=33;
		
		int res=intArr[0]*3;
		System.out.println(res);
		
		int res1=intArr[1]+3;
		System.out.println(res1);
		
		int res2=intArr[2]-3;
		System.out.println(res2);
		
		int res3=intArr[3]/2;
		System.out.println(res3);
		
		int res4=intArr[4]%2;
		System.out.println(res4);
	}

}
