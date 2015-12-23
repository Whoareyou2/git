package com.course.shapes.exercise;

import com.course.animals.IFlyer;

public class Frisbi extends Circle implements IFlyer
{

	public Frisbi()
	{
		// TODO Auto-generated constructor stub
	}

	public Frisbi(double radius)
	{
		super(radius);
		// TODO Auto-generated constructor stub
	}

	public Frisbi(double radius, String color, boolean filled)
	{
		super(radius, color, filled);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly()
	{
		System.out.println("Frisbi flying");

	}

	@Override
	public void land()
	{
		System.out.println("Frisbi landing");

	}

}
