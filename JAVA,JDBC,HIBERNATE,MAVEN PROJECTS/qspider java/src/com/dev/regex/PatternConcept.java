package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat=Pattern.compile("\\d");//represent digit between 0-9 but only one digit
		Matcher mat=pat.matcher("1");
		System.out.println("For \\d:"+mat.matches());
		
		pat=Pattern.compile("\\d+");//represent multiple digit
		mat=pat.matcher("10000");
		System.out.println("For \\d+:"+mat.matches());
		
		pat=Pattern.compile("\\d{2}");//represent specific digit
		mat=pat.matcher("10");
		System.out.println("For \\d for only 2 digit:"+mat.matches());
		
		pat=Pattern.compile("\\d{2,4}");//represent specific digit
		mat=pat.matcher("10");
		System.out.println("For \\d for only in range 2 t o4 digit:"+mat.matches());
		
		pat=Pattern.compile("\\D");//represent anything but number(single char)
		mat=pat.matcher("@");
		System.out.println("For \\D:"+mat.matches());
		
		pat=Pattern.compile("\\D+");//represent anything but number
		mat=pat.matcher("@qwerty $");
		System.out.println("For \\D+:"+mat.matches());
		
		pat=Pattern.compile("\\s");//represent single space
		mat=pat.matcher(" ");
		System.out.println("For \\s:"+mat.matches());
		
		pat=Pattern.compile("\\s+");//represent multiple space
		mat=pat.matcher("    ");
		System.out.println("For \\s+:"+mat.matches());
		
		pat=Pattern.compile("\\S");//represent anything but space(single char)
		mat=pat.matcher("@");
		System.out.println("For \\S:"+mat.matches());
		
		pat=Pattern.compile("\\S+");//represent anything but space
		mat=pat.matcher("vv");
		System.out.println("For \\S+:"+mat.matches());
		
		pat=Pattern.compile("\\w");//represent single char
		mat=pat.matcher("v");
		System.out.println("For \\w:"+mat.matches());
		
		pat=Pattern.compile("\\w+");//represent multiple char
		mat=pat.matcher("hgscj");
		System.out.println("For \\w+:"+mat.matches());
		
		pat=Pattern.compile("\\W");//represent anything but char(single char)
		mat=pat.matcher("@");
		System.out.println("For \\W:"+mat.matches());
		
		pat=Pattern.compile("\\W+");//represent anything but char
		mat=pat.matcher("@%$&");
		System.out.println("For \\W+:"+mat.matches());
	}

}
