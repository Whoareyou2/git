package com.course.tests;
import com.course.shapes.MyPoint;


public class TestPointsArray
{
	public static void main(String[] args)
	{
		// Note: the points are NOT created. Only the array!
		MyPoint[] points = new MyPoint[10];
		
		for (int i = 0; i < points.length; i++)
		{
			// We must create each point separately
			points[i] = new MyPoint(i + 1, i + 1);
		}
		
		// print the points
		for (int i = 0; i < points.length; i++)
		{
			System.out.println(points[i]);
		}
		
		// print the distances between each subsequent point
		for (int i = 0; i < points.length - 1; i++)
		{
			System.out.print(points[i + 1] + " - " + points[i] + " = ");
			
			System.out.println(points[i].distance(points[i + 1]));
		}
		
		
		
	}
}
