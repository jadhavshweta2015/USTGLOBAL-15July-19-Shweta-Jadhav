package com.ustglobal.ustspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.ustspringcore.beans.HelloWorld;
import com.ustglobal.ustspringcore.config.SpringConfig;

public class ComponentsScanApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		HelloWorld obj=context.getBean(HelloWorld.class);
		obj.getAnimal().makeSound();
	}
}
