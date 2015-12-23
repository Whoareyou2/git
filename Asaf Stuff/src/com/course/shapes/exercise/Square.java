package com.course.shapes.exercise;

// This inheritance is awkward. We need to hide information that 
// got from the superclass...
public class Square extends Rectangle
{
	//
	// Constructors
	// 
	public Square()
	{
		// This is important for the integrity of the class
		super(1.0, 1.0);
	}
	
	public Square(double side)
	{
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled)
	{
		super(side, side, color, filled);
		
	}
	
	//
	// Functions
	//
	public double getSide()
	{
		return getLength(); // or getWidth()
	}
	
	public void setSide(double side)
	{
		// Make sure that we set both length and width
		super.setLength(side);
		super.setWidth(side);
	}
	
	// Override both setters in order to make sure that both 
	// width and length are always the same
	public void setWidth(double width)
	{
		setSide(width);
	}
	
	@Override
	public void setLength(double length)
	{
		setSide(length);
	}
	
//	public String toString()
//	{
//		return "A Square with side=" + getSide() + " , which is a subclass of " +
//				super.toString();
//	}

}
