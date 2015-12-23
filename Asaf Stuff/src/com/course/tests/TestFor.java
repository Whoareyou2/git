package com.course.tests;

public class TestFor
{
	public static void main(String[] args)
	{
		// For is the main loop construct. used when the 
		// number of iterations is known in advance
		for (int i = 0; i < 100000; i++)
		{
			System.out.println(i + " ^ 2 = " + i * i);
		}
	}
}
