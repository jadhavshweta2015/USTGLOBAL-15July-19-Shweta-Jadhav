package com.dev.encapsulation;

public class PetData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet p1=new Pet();
		Pet p2=new Pet();
		Pet p3=new Pet();
		
		p1.setPet("Dog");
		p1.setName("shir0");
		p1.setColor("Black");
		p1.setBreed("DoberMan");
		p1.setAge(1);
		
		p2.setPet("Cat");
		p2.setName("Manya");
		p2.setColor("Brown");
		p2.setBreed("German");
		p2.setAge(1);
		
		p3.setPet("Rabbit");
		p3.setName("Abby");
		p3.setColor("White");
		p3.setBreed("Normal");
		p3.setAge(1);
		
		Pet[] pets= {p1,p2,p3};
		
		for(int i=0;i<pets.length;i++) {
			System.out.println("pet:"+pets[i].getPet());
			System.out.println("name:"+pets[i].getName());
			System.out.println("color:"+pets[i].getColor());
			System.out.println("breed:"+pets[i].getBreed());
			System.out.println("age:"+pets[i].getAge());
			System.out.println("********************************");
		}
		
		
	}

}
