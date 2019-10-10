package com.dev.strings;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="some string";
		String str1="some string";
		int s=str.length();
		System.out.println(s);

		char []ch=str.toCharArray();
		System.out.println(ch[10]);

		char c=str.charAt(6);
		System.out.println(c);

		//		boolean c1=str.equals(str1);// match all string sequence
		//		System.out.println(c1);

		boolean c1=str.equalsIgnoreCase(str1);//ignore alphabet matching
		System.out.println(c1);
		
		boolean c2=str.contains("som");
		System.out.println(c2);
		
		String c3=str.replace("some", "something");
		System.out.println(c3);
		
		int c4=str.indexOf("s"); //if not present then gives -1
		System.out.println(c4);
		
		String c5=str.toUpperCase(); 
	//	String c5=str.toLowerCase(); 		
		System.out.println(c5);
		
		//String c6=str.substring(3);//begin index
		String c6=str.substring(0,3);//start and last index
		System.out.println(c6);
		
		
	}

}

