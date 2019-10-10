package com.dev.collection;

import java.util.HashSet;

import com.dev.encapsulation.Pet;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Pet> hs=new HashSet<Pet>();
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
		
		boolean b=hs.add(d);
		boolean b1=hs.add(d1);
		boolean b3=hs.add(d2);

		System.out.println("output of add():"+b+" "+b1+""+b3);
		System.out.println(hs);
		
		System.out.println("size of hashset() "+hs.size());
		
		boolean b2=hs.remove(d);
		System.out.println("remove:"+b2);
		System.out.println(hs);
		
		System.out.println("contains():"+hs.contains(d2));
		
		System.out.println("size of hashset() after remove() "+hs.size());
		
		hs.clear();
		System.out.println("size of hashset() after clear() "+hs.size());


	}

}
