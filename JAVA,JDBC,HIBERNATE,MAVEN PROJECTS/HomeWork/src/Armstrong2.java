
public class Armstrong2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int t1,len=0;
		t1=n;
		while(t1>0)
		{
			t1=t1/10;
			len=len+1;
		}
		int t2,rem,sum=0;
		t2=n;
		while(t2>0)
		{
			int mul=1;
			rem=t2%10;
		
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			t2=t2/10;
		}
		if(sum==n)    
			   System.out.println("Armstrong number ");    
			  else    
			   System.out.println("not Armstrong");  
	}

}
