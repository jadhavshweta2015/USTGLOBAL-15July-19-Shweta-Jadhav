package com.dev.collection;

import java.util.TreeSet;


public class EmployeeTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> ts=new TreeSet<Employee>();

		Employee e=new Employee();
		e.setName("shweta");
		e.setId(10);
		e.setEmail("s@gmail.com");
		e.setPassword(1234);
		
		Employee e1=new Employee();
		e1.setName("abs");
		e1.setId(2);
		e1.setEmail("abs@gmail.com");
		e1.setPassword(1234);
		
		Employee e3=new Employee();
		e3.setName("xyz");
		e3.setId(3);
		e3.setEmail("x@gmail.com");
		e3.setPassword(1234);
		
		ts.add(e);
		ts.add(e1);
		ts.add(e3);
		System.out.println(ts);
	}

}
