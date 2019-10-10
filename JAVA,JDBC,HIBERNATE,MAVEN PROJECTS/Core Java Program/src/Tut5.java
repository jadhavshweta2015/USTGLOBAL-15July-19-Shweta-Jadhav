
public class Tut5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=n;k++){
				System.out.print(" ");
			}
			n--;
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j+"");
				
			}
			
			
			System.out.println();
		}
		for(int i=3;i>=1;i--)
		{
			n=3;
			for(int k=i-1;k<=n;k++){
				System.out.print(" ");
				
			}
			
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j+"");
				
			}
			
			
			System.out.println();
		}
		
	}

	
}
