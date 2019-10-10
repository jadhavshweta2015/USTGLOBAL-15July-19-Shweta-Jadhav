import java.util.Scanner;


public class reversenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int rev=0,j;
		
		System.out.println("Enter no.:");
		int n=s.nextInt();
		
		while(n!=0)
		{
			j=n%10;
			rev=(rev*10)+j;
			n=n/10;
		}
		System.out.println("no.:"+rev);
	}

}
