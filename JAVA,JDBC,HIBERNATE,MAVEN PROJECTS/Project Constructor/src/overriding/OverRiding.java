package overriding;

public class OverRiding {

	/**
	 * @param args
	 */
	public void addition(int x,int y){
		int c=x+y;
		System.out.println("addition is:"+c);
	}
	public int substraction(int x,int y){
		return x-y;
	}
	public int multiplication(int x,int y){
		return x*y;
	}
	}
 class Main extends OverRiding{
	public int division(int x,int y){
		return x/y;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main();
		
		m.addition(10,20);
	}

}
