package Super;

public class B extends A{

	/**
	 * @param args
	 */
	int b;
	B(int tempB){
		super(2);
		System.out.println("iam in B Constructor");
		b=tempB;
		
	}
	public void display(){
		super.display();
		System.out.println("iam in B Constructor"+this.b);
	}
public static void main(String []args){
	B bb=new B(10);
	bb.display();
}
}
