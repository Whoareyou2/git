package com.course.tests;

public class TestArr2
{
	public static void main(String[] args)
	{
		int name = 10;
		
		String[] strArr = new String[5];
		strArr[0] = "Shlomo";
		strArr[1] = "Nikolai";
		strArr[2] = "Dov";
		strArr[3] = "Shlomo";
		strArr[4] = "Shlomo";
		
		
		for (int i = 0; i < strArr.length; i++)
		{
			System.out.println((i+1) + "." + strArr[i]);
		}
		
		// A shortcut for array creation
		String[] names = {"Shlomo", "Nikolai", "Dov"};
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		int[] nums = {4, 3, 4, 3, 7, 54, 67, 4};
		nums[4] = 1298127;  
		
		printArray(nums);
		
	}
	
	// Prints the given array to the console
	public static void printArray(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		
		
	}
}
