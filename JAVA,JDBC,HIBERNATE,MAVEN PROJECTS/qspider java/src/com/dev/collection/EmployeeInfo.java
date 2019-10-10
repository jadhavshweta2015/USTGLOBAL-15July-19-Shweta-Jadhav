package com.dev.collection;

import java.util.HashSet;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> hs=new HashSet<Employee>();
		
		Employee e=new Employee();
		e.setName("shweta");
		e.setId(1);
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

		//update
		e1.setName("namrata");
		e1.setId(4);
		e1.setEmail("n@gmail.com");
		e.setPassword(1234);
		
		
		boolean b=hs.add(e);
		boolean b1=hs.add(e1);
		boolean b2=hs.add(e3);

		System.out.println("Add() "+b+" "+b1+" "+b2);
		System.out.println(hs);
		
		System.out.println("Size() "+hs.size());

		boolean b3=hs.remove(e3);
		System.out.println(hs);
		
		System.out.println("Size() "+hs.size());

		System.out.println("contains()"+hs.contains(e1));

		hs.clear();
		System.out.println(hs);
	}

}
