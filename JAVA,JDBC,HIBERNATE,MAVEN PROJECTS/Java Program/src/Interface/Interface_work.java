/*this is just interface implement program ...here we import another package by syntax *gives scope for all other class but we can specify individually too */
package Interface;
import TestPackage.*;
import java.util.Scanner;

public class Interface_work implements Calculator{
 Scanner s=new Scanner(System.in);
 int i;
	public void add(){
		System.out.print("accept no");
		i=s.nextInt();
	}
	public void display(){
		System.out.print("accept no"+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface_work ss=new Interface_work();
		ss.add();
		ss.display();
	}

}
