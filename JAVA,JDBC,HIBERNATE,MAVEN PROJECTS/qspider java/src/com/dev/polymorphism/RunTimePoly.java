package com.dev.polymorphism;

public class RunTimePoly extends CompileTimePoly {
	@Override 
	public void addition() {
		super.addition();//example of abstraction also
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePoly r=new RunTimePoly();
		r.addition();
	}

}
