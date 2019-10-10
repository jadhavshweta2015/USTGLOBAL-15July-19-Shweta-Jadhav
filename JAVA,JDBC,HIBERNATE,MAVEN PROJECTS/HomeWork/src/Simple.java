import java.util.Scanner;
import java.io.*;

public class Simple {

	/**
	 * @param args
	 */
	int rollno;
	String Class;
	Scanner sc=new Scanner(System.in);
	Simple(){
		this.rollno=34;
		this.Class="se";
	}
	Simple(int i,String j){
		this.rollno=i;
		this.Class=j;
	}
	Simple(Simple je){
		rollno=je.rollno;
		Class=je.Class;
	}
	
	public void display(){
		System.out.println("enter roll no of student:"+rollno);
		System.out.println("enter class of student:"+Class);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple s1=new Simple();
		
		s1.display();
		/*Simple s=new Simple(10,"be");
		Simple s2=new Simple(s);
		
		s.display();
		s2.display();*/
	}

}