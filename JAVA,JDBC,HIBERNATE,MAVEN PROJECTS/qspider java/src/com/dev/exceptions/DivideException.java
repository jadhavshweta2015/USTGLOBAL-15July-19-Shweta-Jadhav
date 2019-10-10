package com.dev.exceptions;

public class DivideException {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		try {
			s();
			divide(10,0);
		} catch (Exception e) {
			throw new CustomException(1);
		}
	}
	
	public static int divide(int i,int j) {
		int res=i/j;
		return res;
	}
	
	public static void s() {
		try {
			StringBuffer sb= new StringBuffer(-1);
		} catch (Exception e) {
			new CustomException().printStackTrace();
		}
	}

}
