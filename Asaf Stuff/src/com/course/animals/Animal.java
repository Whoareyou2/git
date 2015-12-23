package com.course.animals;

public abstract class Animal
{
	//
	// Attributes
	//
	private String name;
	private int age;
	
	//
	// Constructor
	//
//	public Animal()
//	{}
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//
	// Functions
	//
	public abstract void eat();
	
	
	public void sleep()
	{
		System.out.println("Animal sleeping");
	}
	
	public String toString()
	{
		return "Name: " + name + " Age: " + age;
	}
	
}
