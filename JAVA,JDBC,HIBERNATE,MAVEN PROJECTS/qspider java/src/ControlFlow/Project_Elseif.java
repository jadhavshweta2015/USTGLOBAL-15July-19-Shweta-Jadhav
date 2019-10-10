package ControlFlow;

import java.util.Scanner;

public class Project_Elseif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter marks:");
		int marks=s.nextInt();
//		marks=80;  //manually 
		if(marks>90 && marks<=100){
			System.out.println("A Grade");
			System.out.println("Excellent");
		}
		else if(marks>80 && marks<=90){
			System.out.println("B Grade");
			System.out.println("Great");
		}
		else if(marks>70 && marks<=80){
			System.out.println("C Grade");
			System.out.println("good");
		}
		else if(marks>60 && marks<=70){
			System.out.println("D Grade");
			System.out.println("Better");
		}
		else if(marks>50 && marks<=60){
			System.out.println("E Grade");
			System.out.println("Improve your performance");
		}
		else if(marks>40 && marks<=50){
			System.out.println("RETEST");
		}else if(marks>0 && marks<=40){
			System.out.println("Fail");
		}else{
			System.out.println("invalid marks");
		}
	}

}
