
public class Tut6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		for(int i=4;i>=1;i--)
		{
			n=3;
			for(int k=i-1;k<=n;k++){
				System.out.print(" ");
				
			}
			
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j+"");
				
			}
			for(int l=n-1;l<=i;l++)
			{
				
				System.out.print(l+"");
				
			}
			System.out.println();
		}
	}

	
}
