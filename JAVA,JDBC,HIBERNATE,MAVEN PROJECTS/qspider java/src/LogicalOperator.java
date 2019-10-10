
public class LogicalOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		boolean c=false;
		
		boolean d= b&&c;
		System.out.println("result "+d);
		
		boolean d1= b||c;
		System.out.println("result "+d1);
		
		boolean d12= !(b||c);
		System.out.println("result "+d12);
		
		boolean d2= !c;
		System.out.println("result "+d2);
	}

}
