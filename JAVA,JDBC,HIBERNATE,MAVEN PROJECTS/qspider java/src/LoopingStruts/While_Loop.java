package LoopingStruts;

import java.util.Scanner;

public class While_Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i=1;
		int num=37;
		while(i<=10){
			System.out.println("37*"+i+"="+37*i);
			i++;
		}
//		while(i<10){
//			System.out.println("27*"+i+"="+27*i);	//goes on infinite loop bcoz incrementation is not done
//		}
	}

}
