package com.course.animals;

public class Zebra extends Animal
{

	public Zebra()
	{
		super("Zebi", 9);
	}
	public Zebra(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eat()
	{
		System.out.println("Zebra eating");
	}

}
