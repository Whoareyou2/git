package com.course.misc;

import com.course.shapes.MyPoint;

public class TestPassArguments
{
	// In java everything is passed by value.
	public static void main(String[] args)
	{
//		int a = 11;
//		changeValue(a);
//		System.out.println(a);
		
		/////////////////////////////
		MyPoint p = new MyPoint(11, 11);
		changeValue2(p);
		System.out.println(p);
	}
	
	// this has an effect
	public static void changeValue(MyPoint p)
	{
		p.setX(55);
	}
	
	// this has no effect.
	public static void changeValue(int a)
	{
		a = 55;
	}
	
	public static void changeValue2(MyPoint p)
	{
		p = new MyPoint(55, 55);
	}
	
	
	
}
