package Assignments;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="shweta";
		String str1="SHWETA";
		
		int s=str.length();
		System.out.println(s);
		
		char s1=str.charAt(3);
		System.out.println(s1);
		
		boolean s2=str.equals(str1);
		System.out.println(s2);;
		
		boolean s3=str.equalsIgnoreCase(str1);
		System.out.println(s3);
		
		char s4[]=str.toCharArray();
		System.out.println(s4[3]);
		
		
	}

}
