package com.course.tests;

public class TestRandom
{
	public static void main(String[] args)
	{
		// Generate a random number between 0 - 100 
		int num = (int)(Math.random() * 101);
		
		System.out.println(num);
	}  
}
