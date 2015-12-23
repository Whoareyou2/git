package com.course.tests;

public class TestWhile
{
	public static void main(String[] args)
	{
		// while - is a loop for when the number of iterations
		// is not pre determined
		int number = (int)(Math.random() * 1000);
		while (number < 700)
		{
			System.out.println(number);
			number = (int)(Math.random() * 1000);
		}
		
		System.out.println("Final number " + number);
		
		
	}
}
