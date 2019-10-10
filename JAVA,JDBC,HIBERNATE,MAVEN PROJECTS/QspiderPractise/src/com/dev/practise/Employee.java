package com.dev.practise;

public class Employee implements Comparable<Employee> {
	private String name;
	private int id;
	private String email;
	private int password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public int compareTo(Employee d) {
		// TODO Auto-generated method stub
		return this.id - d.id;
	}

}
