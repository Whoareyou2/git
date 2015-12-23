package com.course.tests;

public class TestArrayEx
{
	public static void main(String[] args)
	{
		int[] numbers = new int[10];
		
		
		fillArrayWithRandomNumbers(numbers, 1000);
		printArray(numbers);
		printSumAndAverage(numbers);
	}
	
	// This functions prints the given array
	public static void printArray(int[] nums)
	{
		System.out.print("{ ");
		for (int i = 0; i < nums.length ; i++)
		{
			System.out.print(nums[i]);
			if (i != nums.length -1)
			{
				System.out.print(" , ");
			}
		}
		System.out.println(" }");
		
	}
	
	public static void printSumAndAverage(int[] arr)
	{
		// find the numbers sum
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		System.out.println("Sum: " + sum);
		System.out.println("Avg: " + sum / (double)arr.length);
	}
	
	public static void fillArrayWithRandomNumbers(int[] numbers, int randomRange)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * randomRange);
		}
		
	}
	
}
