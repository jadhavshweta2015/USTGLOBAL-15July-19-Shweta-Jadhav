package com.dev.collection;

import java.util.HashMap;

import com.dev.encapsulation.Pet;

public class C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Pet> hm =new HashMap<String, Pet>();
		
		
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
		
		hm.put("1", d);//if not use this it will get null output
		Pet b=hm.put("1", d);
		System.out.println(b);
		
		hm.put("1", d);
		hm.put("2", d1);
		hm.put("3", d2);
		
		
		System.out.println(hm);
		
		Pet p=hm.remove("2");
		System.out.println(p);
		System.out.println(hm);
		
		System.out.println("containsKey() "+hm.containsKey("1"));
		System.out.println("containsKey() "+hm.containsKey("8"));

		System.out.println("containsvalue() "+hm.containsValue(d));
		
		

	}

}
