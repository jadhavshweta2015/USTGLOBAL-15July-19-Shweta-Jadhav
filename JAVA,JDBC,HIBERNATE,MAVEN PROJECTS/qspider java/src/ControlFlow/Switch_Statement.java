package ControlFlow;

import java.util.Scanner;

public class Switch_Statement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int num;
		while(true){
			System.out.println("Enter Number");
			 num=s.nextInt();			
			switch(num){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("TUESDAY");
				break;
			case 3:
				System.out.println("WEDNESDAY");
				break;
			case 4:
				System.out.println("THURDAY");
				break;
			case 5:
				System.out.println("FRIDAY");
				break;
			case 6:
				System.out.println("SATURDAY");
				break;
			case 7:
				System.out.println("SUNDAY");
				break;
			default :
				System.out.println("it is not number for date");
				break;
			}
		}
	}

}
