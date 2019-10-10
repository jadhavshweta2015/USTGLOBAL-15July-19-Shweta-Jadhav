
public class Tut2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			int letter=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)letter);
				letter++;
			}
			
			System.out.println();
		}
	}

	
}

