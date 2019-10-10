package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pat = Pattern.compile("\\W\\d{2}\\W\\d{10}"); // for phone numbers
		Matcher mat = pat.matcher("+91-9800000000");
		System.out.println(mat.matches());

		pat = Pattern.compile("\\d{1,2}\\W\\w{3}\\W\\d{2,4}");
		mat = pat.matcher("01-Jan-96"); // for date of birth or hire dates
		System.out.println(mat.matches());

		pat = Pattern.compile("[1-9]|1[0-9]|2[0-9]|3[0-9]");//for range value
		mat = pat.matcher("27"); 
		System.out.println(mat.matches());
	}

}
