package com.dev.collection;
import java.util.ArrayList;
import com.dev.encapsulation.Pet;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pet> al=new ArrayList<Pet>(2);
		
		Pet d=new Pet();
		d.setAge(1);
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
		
		al.add(d);
		al.add(d1);
		al.add(d2);
		
		System.out.println(al);
		
		al.trimToSize();
		System.out.println("after TRim methods"+al.size());
	}

}
