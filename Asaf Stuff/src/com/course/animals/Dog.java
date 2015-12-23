package com.course.animals;

public class Dog extends Animal
{
	private String breed = "pudel";
	
	
	public Dog()
	{
		super("Humi", 7);
	}
	
	public Dog(String name, int age, String breed)
	{
		super(name, age);
		this.breed = breed;
	}
	
	public void bark()
	{
		System.out.println("Dog barking hau hau hau");
	}
	public String toString()
	{
		return super.toString() + " Breed: " + breed;
	}
	
	
	@Override
	public void eat()
	{
		bark();
		System.out.println("Dog eating");
	}
	
	
	
}
