package com.dev.encapsulation;

public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setRegno(101);
		s.setName("shweta");
		s.setEmail("S@gmail.com");
		s.setPassword("1234");
		
		
		
		System.out.println("RegNo:"+s.getRegno());
		System.out.println("Name:"+s.getName());
		System.out.println("Email:"+s.getEmail());
		
	}

}
