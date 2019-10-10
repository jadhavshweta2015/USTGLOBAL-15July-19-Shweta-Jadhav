import java.util.Scanner;


public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String original;
		String reverse="";
		System.out.println("enter the string:");
		original=s.nextLine();
		for(int i=original.length()-1;i>=0;i--){
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Reverse string:"+reverse);
	}

}
