package ExampleInterface;

public class Imple implements Animal {

	/**
	 * @param args
	 */
	public void eat(){
		System.out.println("animals eat");
	}
	public void run(){
		System.out.println("animals run");
	}
	public void fly(){
		System.out.println("animals fly");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imple ii=new Imple();
		ii.eat();
		ii.run();
		ii.fly();
	}

}
