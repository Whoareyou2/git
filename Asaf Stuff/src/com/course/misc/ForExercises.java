package com.course.misc;

public class ForExercises
{
	public static void main(String[] args)
	{
		ex4();
	}
	
	public static void ex4()
	{
		int top = (int)(Math.random() * 101);
		System.out.println("NUM: " + top);
		
		// Print all even numbers 'till top
		for (int i = 0; i <= top; i+=2)
		{
			//if (i % 2 == 0){
				System.out.println(i);
			//}
		}
	}
	
	public static void ex2Differently()
	{
		// Generate 2 random numbers
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		
		System.out.println("NUM1: " + num1);
		System.out.println("NUM2: " + num2);
		System.out.println("**********************************");
		
		// Make sure that num1 is the smaller one
		if (num1 > num2)
		{
			// swap the variables
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		// print all numbers from the smaller to the bigger
		for (int i = num1; i <= num2; i++)
		{
			System.out.println(i);
		}
	}
	
	
	public static void ex2()
	{
		// Generate 2 random numbers
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		System.out.println("NUM1: " + num1);
		System.out.println("NUM2: " + num2);
		System.out.println("**********************************");
		
		// print all numbers from the smaller to the bigger
		if (num1 < num2)
		{
			for (int i = num1; i <= num2; i++)
			{
				System.out.println(i);
			}
		}
		else
		{
			for (int i = num2; i <= num1; i++)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void ex1()
	{
		int top = (int)(Math.random() * 101);
		System.out.println("NUM: " + top);
		
		// Print all numbers 'till top
		for (int i = 1; i <= top; i++)
		{
			System.out.println(i);
		}
		
	}
}
