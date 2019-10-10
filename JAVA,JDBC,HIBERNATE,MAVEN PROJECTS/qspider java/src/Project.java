import java.util.Scanner;


public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,res;
		int ch=0;
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first element ");
		x=s.nextInt();
		System.out.println("Enter second element ");
		y=s.nextInt();
		
		while(ch<=3){
			
			System.out.println("**********Menu********");
			System.out.println("\n1.addition");
			System.out.println("\n2.comparison");
			System.out.println("\n3.increment");
			
			System.out.println("enter ur choice =");
			ch=s.nextInt();

			switch(ch){
			case 1:
				res=x+y;
				System.out.println("addition "+res);
				break;
				
			case 2:
				boolean c=x<y;
				System.out.println(c);
				break;
				
			case 3:
				int c1=++x;
				System.out.println(c1);
				break;
				
			default: 
				break;
				
			}
		}
	}

}
