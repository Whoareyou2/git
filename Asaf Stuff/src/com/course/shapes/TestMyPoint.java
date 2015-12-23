package com.course.shapes;


public class TestMyPoint
{
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(3, 5);
		
		p1.setX(7);
		
		System.out.println(p1);
		System.out.println(p2);
		
		// Find the distance between p1 and (3 , 4)
		System.out.println(p1.distance(3, 4));
		
		// Find the distance between p1 and p2
		System.out.println(p1.distance(p2));
		
		System.out.println(p1.distance(p2.getX(), p2.getY()));
		System.out.println(p1.distance(3, 5));
		
		
	} 
	
}
