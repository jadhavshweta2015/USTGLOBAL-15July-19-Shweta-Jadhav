package Calcy;
import java.util.Scanner;
class ModernCalcy extends Main{
	public void fibonaccci(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no:");
		int h=s.nextInt();
		int t1=0,t2=1;
		System.out.println("first"+h+"terms:");
		for(int i=0;i<=h;i++)
		{
			System.out.print(t1+"+");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		
	}
	public void armstrong(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string of no:");
		int r=s.nextInt();
		int c=0,a,temp;
		temp=r;
		while(r>0)
		{
			a=r%10;
			r=r/10;
			c=c+(a*a*a);
			
		}
		if(temp==c)
		  System.out.println("No is armstrong");
		else
			System.out.println("No is not armstrong");
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		ModernCalcy mm= new ModernCalcy();
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no:");
		int k=s.nextInt();
		System.out.println("Enter second no:");
		int l=s.nextInt();
	    

		while(true)
		{
			System.out.println("Menu");
			System.out.println("1.addition");
			System.out.println("2.substrction");
			System.out.println("3.multiplication");
			System.out.println("4.division");
			System.out.println("5.fibonacci");
			System.out.println("6.Armstrong");
			System.out.println("Enter ur choice:");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					
					mm.addition(k,l);
					
					break;
				case 2:
					mm.substraction(k,l);
					break;	
				case 3:
					mm.multiplication(k,l);
					break;
				case 4:
					mm.division(k,l);
					break;
				case 5:
					mm.fibonaccci();
					break;
				case 6:
					mm.armstrong();
					break;

				default:
					System.out.println("invalid choice");
			}
		}
	}

}

