package Assignments;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		
		System.out.println("How many elements u want to insert");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<=n-1;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Display array:");
		for(int i=0;i<=n-1;i++) {
			System.out.println("Element at position "+i+" is "+arr[i]);
		}
		
		System.out.println("Reverse array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("Element at position "+i+" is "+arr[i]);

		}
	}

}
