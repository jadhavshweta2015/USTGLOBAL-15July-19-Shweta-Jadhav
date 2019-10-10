package com.dev.thread;

public class Thread4 extends Thread{

	
	Printer p;
	
	public Thread4(Printer pref) {
		p=pref;
	}
	@Override
	public void run() {
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.printval(10, "Thread 4");
	}
	
}
