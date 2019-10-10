package com.dev.exceptions;

public class ExceptionExample  {

	public static void main(String[] args) throws Exception,NegativeArraySizeException  {
		// TODO Auto-generated method stub

		//s();
		s1();
		System.out.println();

	}

//	public static void s() {
//		try {
//			StringBuffer sb= new StringBuffer(-1);
//		} catch (Exception e) {
//			new CustomException().printStackTrace();
//		}
//	}
	public static void s1() throws CustomException{
		int i=-1;
		if(i<0) {
			System.out.println("getMessage(): "+new CustomException().getMessage());
			throw new CustomException();
		}
	}
}
