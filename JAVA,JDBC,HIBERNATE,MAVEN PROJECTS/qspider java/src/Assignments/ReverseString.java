package Assignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String ss=s.next();
		String reverse="";
		
		
		StringBuilder reverse1=new StringBuilder(ss);
		System.out.println("Reverse string:"+reverse1.reverse());
		
		
		for(int i=ss.length()-1;i>=0;i--) {
			reverse=reverse+ss.charAt(i);
		}
		System.out.println("Reverse String : "+reverse);
	}

}
