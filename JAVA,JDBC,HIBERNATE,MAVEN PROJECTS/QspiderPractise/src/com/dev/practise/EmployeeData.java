package com.dev.practise;

import java.util.HashMap;

public class EmployeeData implements EmployeeInterface {

	HashMap<String, Employee> hm=new HashMap<String, Employee>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
	}
	@Override
	public boolean add(Employee e) {
		
		if(e!=null) {
			hm.put("1", e);
			System.out.println(hm);
			return true;
			//return new HashMap<String, Employee>().put("1", e);
		}
		
		
		return false;
	}
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		hm.remove("1");
		System.out.println(hm);
	}
	@Override
	public void retrive() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		Employee e11=new Employee();
		e11.setName("namrata");
		e11.setId(1);
		e11.setEmail("s@gmail.com");
		e11.setPassword(1234);
		hm.put("1", e11)	;	
		System.out.println(hm);
}
	@Override
	public void contains() {
		// TODO Auto-generated method stub
		
	}

}