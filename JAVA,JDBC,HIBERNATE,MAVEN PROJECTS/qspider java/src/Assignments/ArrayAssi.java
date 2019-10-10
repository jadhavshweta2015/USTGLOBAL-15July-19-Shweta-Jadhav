package Assignments;

import java.util.Scanner;

public class ArrayAssi {

	public static void main(String[] args) {

		int []arr= {1,2,33,4,5};
		Scanner s= new Scanner(System.in);
		System.out.println("Enter index=");
		int num=s.nextInt();
		
		int len=arr.length;
		
		if(num<len) {
			System.out.println("index is present");
			for(int i =0;i<num;i++) {
				System.out.println("elements"+arr[i]);
			}
		}
		else {
			System.out.println("not present");
		}
	}
}
