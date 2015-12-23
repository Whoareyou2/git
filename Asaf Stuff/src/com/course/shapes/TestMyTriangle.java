package com.course.shapes;


public class TestMyTriangle
{
	public static void main(String[] args)
	{
		MyTriangle t1 = new MyTriangle(1, 1, 3, 3, 6, 1);
		
		
		MyTriangle t2 = new MyTriangle(7, 3, 5, 3, 67, 7);
		
		System.out.println(t1);
		System.out.println(t2);
		
		
		System.out.println(t1.getPerimeter());
		System.out.println(t2.getPerimeter());
		
	}
}
