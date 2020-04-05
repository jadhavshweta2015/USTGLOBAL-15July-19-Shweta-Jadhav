package com.ustglobal.ustspringcore.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component("dog")
public class Dog implements Animal {

	
	public Dog() {
		System.out.println("dog object created");
	}
	@PostConstruct
	public void init() {
		System.out.println("dog init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy dog");
	}

	@Override
	public void makeSound() {
		System.out.println("Baoooooooooooooooooo!!!!!!!!");
	}
}