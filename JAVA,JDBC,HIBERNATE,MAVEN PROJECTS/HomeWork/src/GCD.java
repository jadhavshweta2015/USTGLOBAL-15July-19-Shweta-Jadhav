import java.util.Scanner;


public class GCD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first no:");
		n1=s.nextInt();
		System.out.println("enter Second no:");
		n2=s.nextInt();
		System.out.println("GCD of two numbers " + n1 +" and " + n2 +" is :" + findGCD(n1,n2));

	}
		private static int findGCD(int n1, int n2) {
			if(n2==0)
				return n1;
			else
				return findGCD(n2,n1%n2);
		
	}

}
