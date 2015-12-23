package com.course.animals;

public class Dambo extends Elephant implements IFlyer
{

	public Dambo()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly()
	{
		System.out.println("Dambo flying");

	}

	@Override
	public void land()
	{
		System.out.println("Dambo landing");

	}

}
