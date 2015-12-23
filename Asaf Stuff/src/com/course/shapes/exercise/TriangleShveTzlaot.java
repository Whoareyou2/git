package com.course.shapes.exercise;

public class TriangleShveTzlaot extends Shape
{
	private double tzela = 1.0; 
	
	public TriangleShveTzlaot(double tzela)
	{
		super();
		this.tzela = tzela;
	}

	@Override
	public double getArea()
	{
		double base = tzela;
		double height = 
				Math.sqrt(tzela * tzela - (tzela/2 * tzela/2));
		
		return base * height / 2;
				
	}

	@Override
	public double getPerimeter()
	{
		return 3 * tzela;
	}
	
	
	

}
