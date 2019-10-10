package com.ustglobal.ustspringcore.config;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.ustspringcore.beans.Animal;
import com.ustglobal.ustspringcore.beans.Dog;
import com.ustglobal.ustspringcore.beans.HelloWorld;
import com.ustglobal.ustspringcore.beans.Human;

@Configuration
public class BeanConfig {
	@Bean(name="obj")//,autowire=Autowire.BY_TYPE
	public HelloWorld helloWorld() {
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.setMsg("hello world!!!!!");
		helloWorld.setCount(100);
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("abc", 123);
		map.put("zc", 234);
		helloWorld.setMap(map);
//		Animal animal=getDog();
//		helloWorld.setAnimal(getDog());//wiring //manually// use annotation autowire
		return helloWorld;
	}
	
	
	@Bean(name="dog")
	@Scope(value="prototype")
	public Dog getDog() {
		return new Dog();
	}
	
	
	@Bean("human")
	public Human getHuman() {
		return new Human();
	}
}
