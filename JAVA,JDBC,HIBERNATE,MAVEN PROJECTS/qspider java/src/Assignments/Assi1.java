package Assignments;


import java.util.Scanner;

public class Assi1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int num;
		 String name= "Shweta";
		while(true){
			System.out.println("Enter Number");
			 num=s.nextInt();			
			switch(num){
			case 1:
				
			case 2:
				
			case 3:
				
			case 4:
				
			case 5:
				System.out.println("weekday");
				System.out.println(name);
				break;
			case 6:
				
			case 7:
				System.out.println("SUNDAY");
				for(int j=0;j<5;j++){
				System.out.println(name);
				}
				break;
			default :
				System.out.println("it is not number for date");
				break;
			}
		}
	}

}
