package com.ustglobal.ustspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.ustspringcore.beans.Animal;
import com.ustglobal.ustspringcore.beans.HelloWorld;
import com.ustglobal.ustspringcore.config.BeanConfig;

public class AnnotationConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		
		HelloWorld obj=context.getBean(HelloWorld.class);
		System.out.println(obj.getMsg());
		System.out.println(obj.getCount());
		System.out.println(obj.getMap());
		obj.getAnimal().makeSound();
		
		/*Animal animal=context.getBean(Animal.class);
		Animal animal1=context.getBean(Animal.class);
		System.out.println(animal==animal1);*/
		Animal animal=(Animal)context.getBean("dog");
		Animal animal1=(Animal)context.getBean("dog");
		System.out.println(animal==animal1);
		
		context.close();
		
	}
}
