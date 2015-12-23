package com.course.shapes.exercise;

public class Circle extends Shape
{
	//
	// Attributes
	//
	private double radius = 1.0;
	
	//
	// Constructors
	//
	public Circle()
	{
		//	super();
	}	
	
	public Circle(double radius)
	{
		//	super();
		this.radius = radius;
	}	

	public Circle(double radius, String color, boolean filled)
	{
		super(color, filled);
		this.radius = radius;
	}
	//
	// Functions
	//
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		if (radius > 0)
			this.radius = radius;
		// TODO: deal with the exception
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter()
	{
		return 2 * Math.PI * radius;
	}

//	public String toString()
//	{
//		return "A Circle with radius=" + radius + 
//				", which is a subclass of " + super.toString();
//	}

}
