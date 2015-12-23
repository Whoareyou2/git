package com.course.animals;

public class Wolf extends Animal
{

	public Wolf()
	{
		super("wolfi", 9);
		
	}
	public Wolf(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eat()
	{
		System.out.println("Wolfi eating"); 
	}

}
