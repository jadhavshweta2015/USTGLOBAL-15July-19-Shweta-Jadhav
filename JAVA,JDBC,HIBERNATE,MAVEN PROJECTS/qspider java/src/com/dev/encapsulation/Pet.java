package com.dev.encapsulation;

public class Pet implements Comparable<Pet> {

	@Override
	public String toString() {
		return "Pet [pet=" + pet + ", name=" + name + ", age=" + age + ", color=" + color + ", breed=" + breed + "]";
	}

	private String pet;
	private String name;
	private int age;
	public String getPet() {
		return pet;
	}

	public void setPet(String pet) {
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	private String color;
	private String breed;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Pet d) {
		// TODO Auto-generated method stub
		return (this.age - d.age);
	}

}
