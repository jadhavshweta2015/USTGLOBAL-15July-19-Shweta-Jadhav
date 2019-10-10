package com.dev.collection;

import java.util.TreeSet;

import com.dev.encapsulation.Pet;

public class C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Pet> ts=new TreeSet<Pet>();

		Pet d=new Pet();
		d.setAge(10);
		d.setBreed("doberMan");
		d.setName("shiro");
		d.setColor("black");
		
		Pet d1=new Pet();
		d1.setAge(2);
		d1.setBreed("Dalmation");
		d1.setName("anny");
		d1.setColor("w&B");
		
		Pet d2=new Pet();
		d2.setAge(2);
		d2.setBreed("pug");
		d2.setName("dumcy");
		d2.setColor("brown");
		
		ts.add(d);
		ts.add(d1);
		ts.add(d2);
		
		for (Pet pet : ts) {
			System.out.println(ts);
		}
		
		
	}

}
