package com.course.shapes.exercise;

public final class TestShapes2
{
	public static void main(String[] args)
	{
		// Create an array of shapes and fill it
		Shape[] shapes = new Shape[100];
		for (int i = 0; i < shapes.length; i+=4)
		{
			shapes[i] = new Circle(i + 1);
			shapes[i + 1] = new Rectangle(i + 1, i + 2);
			shapes[i + 2] = new Square(i + 1);
			shapes[i + 3] = new TriangleShveTzlaot(i + 1);
		}
		
		
		// pretty print the shapes
//		for (int i = 0; i < shapes.length; i++)
//		{
//			System.out.println("*******************");
//			System.out.println(shapes[i].getClass().getSimpleName());
//			System.out.println("Area " + shapes[i].getArea());
//			System.out.println("Perimeter: " + shapes[i].getPerimeter());
//			
//		}
//		
//		// For each shape 's' inside 'shapes' array, do:
//		for (Shape s : shapes)
//		{
//			System.out.println("*******************");
//			System.out.println(s.getClass().getSimpleName());
//			System.out.println("Area " + s.getArea());
//			System.out.println("Perimeter: " + s.getPerimeter());
//		}
//		
		for (Shape s : shapes)
		{
			System.out.println("*******************");
			System.out.println(s);
		}
	
		
	}

}
