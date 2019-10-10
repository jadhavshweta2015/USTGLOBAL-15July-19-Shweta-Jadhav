package Assignments;

public class Assi3Star {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=4;
int letter=65;
int letter1=97;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<i;j++)
			{
				System.out.print((char)letter+""+""+(char)letter1+" ");
				letter++;
				letter1++;
			}
			
			System.out.println();
		}
	}
}


