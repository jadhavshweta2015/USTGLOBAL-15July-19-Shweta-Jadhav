package com.dev.exceptions;

public class ExceptionHandling {

	public static void s() {
		StringBuffer sb= new StringBuffer(-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			s();
		}catch(Exception e){
			System.out.println("exception ");
			e.printStackTrace();
		}finally {
			System.out.println("this is finally blocks");
		}
		System.out.println("code after exception");
	}

}
