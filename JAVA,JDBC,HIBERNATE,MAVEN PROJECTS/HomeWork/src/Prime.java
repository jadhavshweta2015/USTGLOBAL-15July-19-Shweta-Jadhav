import java.util.Scanner;


public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter the number");
		int n=s.nextInt();
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("not a prime number");

		}
		else{
			System.out.println("number is prime");

		}*/
		
		int num = 100, count;

		  for (int i = 1; i<= num; i++) {
		   count = 0;
		   for (int j = 2; j<= i-1; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
	}

}
