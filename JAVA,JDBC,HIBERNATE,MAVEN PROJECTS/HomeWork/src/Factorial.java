import java.util.Scanner;


public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,fact=1;
		System.out.println("Enter the number:");
		int n=s.nextInt();
		if(n<0){
			System.out.println("number is negative doesnt have factiaral");
		}
		else{
			for(i=1;i<=n;i++){
				fact=fact*i;
			}
			System.out.println("Factorial is:"+fact);
		}
		
	}

}
