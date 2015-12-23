package com.course.animals;

public class Fish extends Animal
{

	public Fish()
	{
		super("Fishi", 9);
	}
	
	@Override
	public void eat()
	{
		System.out.println("Fish eating");
	}

}
