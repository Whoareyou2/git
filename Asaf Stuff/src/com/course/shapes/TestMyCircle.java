package com.course.shapes;


public class TestMyCircle
{
	public static void main(String[] args)
	{
		MyCircle c1 = new MyCircle(1, 1, 5);
		MyCircle c2 = new MyCircle(2, 2, 9);
	
		///////////////////////////////////////////////////////
//		MyCircle c3 = new MyCircle(new MyPoint(5, 5), 7);
//		
//		MyPoint pp = new MyPoint(5, 5);
//		MyCircle c4 = new MyCircle(pp, 7);
//		
//		
//		c4.setRadius(-678);
		
		System.out.println(c1.getCenter().getY());
		
		// This will replace the entire 'center' object
		//c1.setCenter(new MyPoint(7, 8));
		
		System.out.println(c1);
		
		// c1.getCenter().setX(7);
		c1.setCenterX(7);
		
		System.out.println(c1);
		
	}
}
