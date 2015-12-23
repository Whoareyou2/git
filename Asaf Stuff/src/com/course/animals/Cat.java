package com.course.animals;

public class Cat extends Animal
{
	
	
	
	public Cat()
	{
		super("Mitzi", 2);
	}
	
	@Override
	public void eat()
	{
		System.out.println("Cat eating");
	}
	
	
}
