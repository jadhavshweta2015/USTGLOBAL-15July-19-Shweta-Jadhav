package LoopingStruts;

import java.util.Scanner;

public class For_Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the no. that u want that table=");
//		int n=s.nextInt();
//		for(int i=1;i<=10;i++){
//			System.out.println(n+"*"+i+"="+n*i);
//
//		}
//		System.out.println("outside for loop");
		
		
		System.out.println("Enter the no. that u want that table=");
		int n=s.nextInt();
		for(int i=1;i<=10;){
			System.out.println(n+"*"+i+"="+n*i);
			i++;
		}
		System.out.println("outside for loop");
		
//		for(;;){
//			System.out.println("inside for loop");  // for loop works without giving arg but goes to infite loop.
//		}

//		for(;;){
//			System.out.println("inside for loop");
//		}
//		System.out.println("outside for loop");  //it gives unreachable Statement bcoz loop is infinite it can't reach to finite statement. 
	}

}
