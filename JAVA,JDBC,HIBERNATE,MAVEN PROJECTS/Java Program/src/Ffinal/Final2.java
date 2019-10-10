//final method is inherited but can not override...here method is override so getting compile error ...
package Ffinal;

public class Final2 {

	final void run(){
		System.out.print("run");
	}
}
class ggg extends Final2{
//	void run()
//	{
//		System.out.print("safe run");
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ggg g=new ggg();
		g.run();
	}

}
