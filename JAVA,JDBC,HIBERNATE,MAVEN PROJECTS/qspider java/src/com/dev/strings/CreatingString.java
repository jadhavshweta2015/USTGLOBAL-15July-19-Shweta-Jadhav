package com.dev.strings;

public class CreatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		str="hello";
		
		String str1="Java";
		
		String str2=new String("hello java");
		
		StringBuffer sb=new StringBuffer("shweta");
		
		StringBuilder sbu=new StringBuilder("jadhav");
		
		//StringBuffer sb1=new StringBuffer(-1);  //NegativeArraySizeException
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		System.out.println(sb+" "+sbu);


	}

}
