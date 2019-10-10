
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int reminder,sum=0,temp;    
		  int n=1;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		 reminder=n%10;  //getting remainder  
		   sum=sum+reminder*reminder*reminder;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("Armstrong number ");    
		  else    
		   System.out.println("not Armstrong");   
		
	}

}
