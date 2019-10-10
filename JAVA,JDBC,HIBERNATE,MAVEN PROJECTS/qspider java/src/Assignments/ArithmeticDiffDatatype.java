package Assignments;

import java.util.Scanner;

public class ArithmeticDiffDatatype {

	static Scanner s=new Scanner(System.in);
	static ArithmeticDiffDatatype ad=new ArithmeticDiffDatatype();
	
	public void operation(int i,int j) {
		int c=i+j;
		System.out.println("Addition:"+c);
	}
	
	public void operation(float j,int i,double k) {
		double c=j+i+k;
		System.out.println("Addition:"+c);
	}
	
	public void operation(int i,double d) {
		double c=i+d;
		System.out.println("Addition:"+c);
	}
	
	public void subOperation(int i,int j) {
		int c=i-j;
		System.out.println("sunstraction:"+c);
	}
	
	public void subOperation(float j,int i,double k) {
		double c=j-i-k;
		System.out.println("sunstraction:"+c);
	}
	
	public void subOperation(int i,double d) {
		double c=i-d;
		System.out.println("sunstraction:"+c);
	}
	
	
	public void mulOperation(int i,int j) {
		int c=i*j;
		System.out.println("multiplication:"+c);
	}
	
	public void mulOperation(float j,int i,double k) {
		double c=j*i*k;
		System.out.println("multiplication:"+c);
	}
	
	public void mulOperation(int i,double d) {
		double c=i*d;
		System.out.println("multiplication:"+c);
	}
	
	
	public void divOperation(int i,double d) {
		double c=i/d;
		System.out.println("division:"+c);
	}
	
	public void divOperation(int i,int j) {
		int c=i/j;
		System.out.println("division:"+c);
	}
	public void divOperation(float j,int i,double k) {
		double c=j/(i/k);
		System.out.println("division:"+c);
	}
	
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		while(true) {
			int ch=0;
			System.out.println("********Menu********");
			System.out.println("1.addition ");
			System.out.println("2.substraction of two int element ");
			System.out.println("3.multiplication");
			System.out.println("4.Division");
			System.out.println("enter ur choic:");
			ch=s.nextInt();
			switch(ch) {
			case 1: 
				int op=0;
				while(op<=3) {
					
					System.out.println("1.addition of two int element ");
					System.out.println("2.addition of float, int and double element ");
					System.out.println("3.addition of  int and double element ");
					System.out.println("enter ur choic:");
					op=s.nextInt();
					switch(op) {
					case 1:
						ad.operation(1,1);
						break;
					case 2:
						ad.operation(1.5f,1 ,2.5);
						   break;
					case 3:
						ad.operation(1.5f,1 ,2.5);
						   break;
					default :
						System.out.println("invalid option");
						break;
						
					}
					
				}
				
				break;
					
			case 2:
				int op2=0;
				while(op2<=3) {
					
					System.out.println("1.sub of two int element ");
					System.out.println("2.sub of float, int and double element ");
					System.out.println("3.sub of  int and double element ");
					System.out.println("enter ur choic:");
					op2=s.nextInt();
					switch(op2) {
					case 1:
						ad.subOperation(1, 1);
						break;
					case 2:
						ad.subOperation(1.5f,1 ,2.5);
						break;
					case 3:
						ad.subOperation(5, 6.8);
						   break;
					default :
						System.out.println("invalid option");
						break;
						
					}
					
				}
				   break;
			
			case 3:
				int op3=0;
				while(op3<=3) {
					
					System.out.println("1.multiplication of two int element ");
					System.out.println("2.multiplication of float, int and double element ");
					System.out.println("3.multiplication of  int and double element ");
					System.out.println("enter ur choic:");
					op3=s.nextInt();
					switch(op3) {
					case 1:
						ad.mulOperation(1, 1);
						break;
					case 2:
						ad.mulOperation(1.5f,1 ,2.5);
						break;
					case 3:
						ad.ad.mulOperation(5, 6.8);
						   break;
					default :
						System.out.println("invalid option");
						break;
						
					}
					
				}
				   break;
			
			   
		    case 4:
		    	int op4=0;
				while(op4<=3) {
					
					System.out.println("1.div of two int element ");
					System.out.println("2.div of float, int and double element ");
					System.out.println("3.div of  int and double element ");
					System.out.println("enter ur choic:");
					op4=s.nextInt();
					switch(op4) {
					case 1:
						ad.divOperation(1, 1);
						break;
					case 2:
						ad.divOperation(1.5f,1 ,2.5);
						break;
					case 3:
						ad.divOperation(5, 6.8);
						   break;
					default :
						System.out.println("invalid option");
						break;
						
					}
					
				}
				   break;
		    	
			   
		
		    default :
		    	System.out.println("invalid");
		    	break;
			}

		}

		
	}

}
