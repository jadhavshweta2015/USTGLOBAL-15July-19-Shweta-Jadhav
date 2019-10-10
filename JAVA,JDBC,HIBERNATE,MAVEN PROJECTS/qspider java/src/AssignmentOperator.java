
public class AssignmentOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		i=10;
		j=5;	//asignment operator
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		i+=j;	//compound assignment operator
		System.out.println("i="+i);
		j+=i;
		System.out.println("j="+j);
		
		j-=i;
		System.out.println("j="+j);
		
		j*=i;
		System.out.println("j="+j);
		
		j/=i;
		System.out.println("j="+j);
		
		j%=i;
		System.out.println("j="+j);
	}

}
