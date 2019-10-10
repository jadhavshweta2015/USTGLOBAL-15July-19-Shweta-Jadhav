package Assignments;

public class Assi6PyramidA1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int letter =65;
		for (int i = 1; i <= 3; i++)
        {
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
            for (int k = i; k >= 1; k--)
            {
                System.out.print((char)letter);
                letter++;
            }
            for(int l=2;l<=i;l++)
			{
            	
				System.out.print((char)letter);
				letter++;
			}
            System.out.println();
        }
		int b=1;
		for(int i=2;i<=3;i++){
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print(b);
				b++;
			}
			for(int l=2;l>=i;l--)
			{
				System.out.print(b);
				b++;
			}
			System.out.println();
		}
	}

}
