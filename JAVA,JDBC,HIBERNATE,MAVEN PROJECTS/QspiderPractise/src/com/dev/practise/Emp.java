package com.dev.practise;

public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData ed=new EmployeeData();
		 Employee e1=new Employee();
		e1.setName("shweta");
		e1.setId(1);
		e1.setEmail("s@gmail.com");
		e1.setPassword(1234);
		
		
		
		boolean b=ed.add(e1);
		System.out.println(b);
		ed.remove();
		ed.update();
	}

}