package com.course.shapes.exercise;

public class TestShape
{
	public static void main(String[] args)
	{
		//Shape sh = new Shape("blue", false);
		//System.out.println(sh);
		
		Circle c = new Circle();
		
		System.out.println(c);
		
		Rectangle r = new Rectangle(2, 4.0, "orange", false);
		System.out.println(r);
	
		Square s = new Square();
		
		s.setSide(9);
		s.setLength(7);
		System.out.println(s);
	}
}
