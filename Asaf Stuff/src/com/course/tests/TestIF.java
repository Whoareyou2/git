package com.course.tests;

public class TestIF
{
	public static void main(String[] args)
	{
		int salary = (int)(Math.random() * 100000);
		System.out.println("Salary : " + salary);
		if (salary > 80000 )
		{
			System.out.println("VERY VERY NICE!");
		}
		else if (salary > 50000)
		{
			System.out.println("Very nice!");
		}
		
		else if (salary > 20000)
		{
			System.out.println("Nice!");
		}
		else
		{
			System.out.println("Try harder!");
		}
	}
}
