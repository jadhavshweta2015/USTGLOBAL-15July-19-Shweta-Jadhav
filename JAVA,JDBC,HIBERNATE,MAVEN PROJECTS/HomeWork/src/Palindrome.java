
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reminder,sum=0,temp;    
		  int n=4;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		 reminder=n%10;  //getting remainder  
		   sum=(sum*10)+reminder;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		
	}

}
