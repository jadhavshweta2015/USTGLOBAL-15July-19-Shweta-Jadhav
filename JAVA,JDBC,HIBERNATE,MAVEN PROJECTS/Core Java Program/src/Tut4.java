
public class Tut4 {

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
	}

	
}
