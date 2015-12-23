package com.course.shapes.exercise;

public class Rectangle extends Shape
{
	//
	// Attributes
	//
	private double width = 1.0;
	private double length = 5.0;
	
	//
	// Constructors	
	//
	public Rectangle()
	{
	}
	
	public Rectangle(double width, double length)
	{
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, 
			boolean filled)
	{
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	//
	// Functions
	//
	public double getWidth()
	{
		return width;
	}

	public void setWidth(double width)
	{
		if (width > 0)
			this.width = width;
		// TODO: deal with error
	}

	public double getLength()
	{
		return length;
	}

	public void setLength(double length)
	{
		if (length > 0 )
			this.length = length;
		// TODO: deal with error
	}

	public double getArea()
	{
		return width * length;
	}
	
	public double getPerimeter()
	{
		return 2 * ( width + length );
	}
	
	//@Override
//	public String toString()
//	{
//		// TODO Auto-generated method stub
//		return "A Rectangle with width=" + this.width + " and length=" + this.length + 
//				" , which is a subclass of " + super.toString();
//	}
}
