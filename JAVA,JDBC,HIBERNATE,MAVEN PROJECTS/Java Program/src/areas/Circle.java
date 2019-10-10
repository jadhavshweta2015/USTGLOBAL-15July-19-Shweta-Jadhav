package areas;

import java.util.Scanner;

public class Circle {

	int i;
	double pie=3.14;
	Scanner s=new Scanner(System.in);
	
	public void area()
	{
		System.out.println("enter radius:");
		i=s.nextInt();
		double a=pie*(i*i);
		System.out.println("Area:"+a);
		
	}
	public void area(int c,int d)
	{
		System.out.println("enter length:");
		c=s.nextInt();
		System.out.println("enter breadth:");
		d=s.nextInt();
		double m=c*d;
		System.out.println("Area:"+m);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle l=new Circle();
		l.area();
		l.area(10,20);
	
	}

}
