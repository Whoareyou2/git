package com.course.animals;

public class Mouse extends Animal
{

	public Mouse()
	{
		super("Mickey", 1);
	
	}
	public Mouse(String name, int age)
	{
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eat()
	{
		System.out.println("Mouse eating");
		
	}

}
