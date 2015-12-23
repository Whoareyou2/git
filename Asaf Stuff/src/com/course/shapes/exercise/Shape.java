package com.course.shapes.exercise;

public abstract class Shape
{
	//
	// Attributes
	//
	private String color = "red";
	private boolean filled = true;
	
	//
	// Constructors
	//
	public Shape()
	{}
	
	public Shape(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}
	
	//
	// Functions
	//
	public String getColor()
	{
		return color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
		
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
//	@Override
//	public String toString()
//	{
//		return "A Shape with color of " + color + " and " + 
//				(filled ? "filled" : "not filled");
//	}	
	
	@Override
	public final String toString()
	{
		// template method
		return getClass().getSimpleName() + 
			   " Area: " + getArea() + 
			   " Perimeter: " + getPerimeter();
	}	
		
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
