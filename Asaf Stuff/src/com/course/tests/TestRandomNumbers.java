package com.course.tests;

public class TestRandomNumbers
{
	public static void main(String[] args)
	{
		// Generate 2 random numbers
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		
		// Print the numbers
		System.out.println("The first number is: " + num1);
		System.out.println("The second number is: " + num2);
		
		// Print the sum of the numbers
		int sum = num1 + num2;
		System.out.println("The sum is: " + sum);
		
		// Print the average 
		System.out.println("The average is " + sum/2.0);
		
		// Print the remainder from 10
		System.out.println("The remainder from 10 is: " + num1 % 10);
		System.out.println("The remainder from 10 is: " + num2 % 10);
		
		// Print the area
		int area = num1 * num2;
		System.out.println("The area is : " + area);
		
	}
}
