import java.util.Scanner;


public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter string:");
		Scanner s=new Scanner(System.in);
		String d=s.next();
		for(int i=0;i<=d.length();i++)
		{
			if(d.charAt(i)=='a'||d.charAt(i)=='i'||d.charAt(i)=='o'||d.charAt(i)=='e'||d.charAt(i)=='u')
			{
				System.out.println("string contains:"+d.charAt(i));
			}
			else
			{
				System.out.println("consonent:"+d.charAt(i));
			}
		}
	}

}
