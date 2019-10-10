package com.dev.thread;

public class MainThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started...");
		
		Thread2 t2=new Thread2();
		t2.start();
		t2.setName("Thread T2");
		System.out.println("Thread2 id:"+t2.getId());
		t2.setPriority(1);
		System.out.println("Thread2 priority::"+t2.getPriority());
		
		//new T2().start();//for start the execution for this create object aa the start is non static

		System.out.println(t2.getName());
		
		
		Thread3 t=new Thread3();
		Thread t1=new Thread(t);
		t1.start();
		//new Thread(new T3()).start();//create object for T3 class and that object pass in thread

		System.out.println("Thread3 id:"+t1.getId());
		t1.setPriority(2);
		System.out.println("Thread3 priority::"+t1.getPriority());

		Thread.currentThread().setName("Main Thread");
		System.out.println("Main Thread:"+Thread.currentThread().getName());
		System.out.println("Main thread id:"+Thread.currentThread().getId());
		Thread.currentThread().setPriority(3);
		System.out.println("priority::"+Thread.currentThread().getPriority());


		
		
		
		
		for(int i=1;i<=10;i++) {
			System.out.println("i:"+i);
		}
		
		System.out.println("Main thread terminated");
	}

}
