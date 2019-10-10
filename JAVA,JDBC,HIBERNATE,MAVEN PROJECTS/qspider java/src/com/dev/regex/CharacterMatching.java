package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat=Pattern.compile("\\w+\\@\\w+\\.\\w+");
		Matcher mat=pat.matcher("shweta@gmail.com");
		System.out.println("For gmail pattern:"+mat.matches());
		
		pat=Pattern.compile("\\w+\\s\\w+");
		mat=pat.matcher("shweta jadhav");
		System.out.println("For name with space:"+mat.matches());
		
		pat=Pattern.compile("[A-Za-z]{1,25}\\s[A-Za-z]{1,25}");//for names with limited chars
		mat=pat.matcher("shweta jadhav");
		System.out.println("For name with specific charachert:"+mat.matches());
		
		pat = Pattern.compile("\\w+\\W+\\w+"); //for alphanumeric passwords
		mat = pat.matcher("afimf#4df");
		System.out.println(mat.matches());
	}

}
