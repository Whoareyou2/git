package com.course.misc;

public class IfExercises
{
	public static void main(String[] args)
	{
		ex4();
		//ex1();
		
	}
	
	public static void ex4()
	{
		int salary = (int)(Math.random() * 1001) + 5000;
		
		// Raise the salary by 10% if after the raise it is still
		// smaller than 6000
		System.out.println("Basic Salary: " + salary);
		if (salary * 1.1  <= 6000)
		{
			salary = (int)(salary * 1.1);
		}
		
		System.out.println("Updated salary: " + salary);
	}
	
	public static void ex3()
	{
		int num = (int)(Math.random() * 101);
		System.out.println("NUM: " + num);
		
		if (num % 2 == 0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
	
	public static void ex2()
	{
		int num = (int)(Math.random() * 101);
		System.out.println("NUM: " + num);
		
		if (num > 50)
		{
			System.out.println("BIG");
		}
		else if (num < 50)
		{
			System.out.println("SMALL");
		}
		else
		{
			System.out.println("BINGO!");
		}
	}
	
	public static void ex1()
	{
		// Generate 2 random numbers
		int num1 = (int)(Math.random() * 101);
		int num2 = (int)(Math.random() * 101);
		
		System.out.println("NUM1: " + num1);
		System.out.println("NUM2: " + num2);
		
		// Print the bigger
		if (num1 > num2)
		{
			System.out.println(num1);
		}
		else
		{
			System.out.println(num2);
		}
	}
}
