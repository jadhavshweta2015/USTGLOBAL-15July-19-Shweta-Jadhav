package Assignments;

import java.util.Scanner;

public class AddArrayElement {

	public static void main(String[] args) {
		int first,mid,last;
		
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
		
		first=arr[0];
		System.out.println("first element:"+first);
		
		last=arr[n-2];
		System.out.println("last element:"+last);
		
		mid=arr[n/2];
		System.out.println("mid element:"+mid);
		
		int add=first+mid+last;
		System.out.println("Addition:"+add);
		
	}

}