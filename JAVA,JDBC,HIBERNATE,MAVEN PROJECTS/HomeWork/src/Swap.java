import java.util.Scanner;


public class Swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter one element");
		int n=s.nextInt();
		System.out.println("Enter second element");
		int n2=s.nextInt();
		if(n>n2)
		{
			temp=n;
			n=n2;
			n2=temp;
		}
		
	System.out.println("sorted no:"+n+"and"+n2);
	}
	

}
