package com.course.animals;

public class FlyingFish extends Fish implements IFlyer
{

	public FlyingFish()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat()
	{
	}
	
	@Override
	public void fly()
	{
		System.out.println("Fish flying");

	}

	@Override
	public void land()
	{
		System.out.println("Fish landing");

	}

}
