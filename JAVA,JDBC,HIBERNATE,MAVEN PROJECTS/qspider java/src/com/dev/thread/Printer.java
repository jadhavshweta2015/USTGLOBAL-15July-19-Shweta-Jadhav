package com.dev.thread;

public class Printer {

	synchronized public void printval(int i,String thread) {
		for(int j=1;j<=i;j++) {
			System.out.println("thread:"+thread+" j:"+j);
		}
	}
	public static void main(String[] args) {
		

	}

}
