package com.dev.exceptions;

public class MoreCatchBlock {

	public static void main(String[] args)  {
		
		try {
			s();
			System.out.println("no exception for s");
			int res=divide(10,0);
			System.out.println("no exception for divide");
			System.out.println(res);
		} catch (NegativeArraySizeException e) {
			System.err.println("exception for s");
			e.printStackTrace();
		} catch(ArithmeticException ee) {
			System.err.println("exception for divide");
			System.err.println("getMessage(): "+ee.getMessage());
			ee.printStackTrace();
		} finally {
			System.out.println("finally block is always execute with eception or without");
		}
	}

	public static int divide(int i,int j) {
		int res=i/j;
		return res;
	}

	public static void s() {
		
		StringBuffer sb= new StringBuffer(1);
	}

}
