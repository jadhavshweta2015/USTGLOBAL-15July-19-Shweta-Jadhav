package ControlFlow;

import java.util.Scanner;

public class If_Elseif_Statement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=s.nextInt();
		System.out.println("Enter second number");
		int n2=s.nextInt();
		System.out.println("Enter third number");
		int n3=s.nextInt();
		if(n1>n2 && n1>n3){
			System.out.println("first"+n1+"is greater");
		}else if(n2>n3 && n2>n1){
			System.out.println("second"+n2+"is greater");
		}else{
			System.out.println("third"+n3+"is greater");
		}
	}

}
