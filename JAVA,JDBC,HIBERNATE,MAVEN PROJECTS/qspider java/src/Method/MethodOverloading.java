package Method;

public class MethodOverloading {

	static MethodOverloading m= new MethodOverloading();
	
	public void print() {
		System.out.println("with no arg");
	}
	public void print(int i) {
		System.out.println("with int arg");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m.print();
	}

}
