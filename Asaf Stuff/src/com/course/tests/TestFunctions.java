package com.course.tests;

public class TestFunctions
{
	public static void main(String[] args)
	{
		int y = square(7);
		System.out.println(y);
		
		System.out.println(square(3));
		y = square(1);
		System.out.println(y);
		
		printSum(4, 5);
		printSum(1234, 4675);
		printSum(14, 25);
	}
	
	//        [return-type]  [arguments]
	public static int square(int x)
	{
		return x * x;
	}
	
	public static void printSum(int a, int b)
	{
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
