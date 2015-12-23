package com.course.tests;

public class TestForEach
{

	public static void main(String[] args)
	{
		double[] nums = {5.5, 3, 4.5, 354, 5.5, 2.2};
		
		// Regular for
		for (int i = 0; i < nums.length; i++)
		{
			double num = nums[i];
			System.out.println(num);
		}
		
		// For each (Officialy - for in)
		// read: for each 'currentNum' inside 'nums' do:
		for (double num : nums)
		{
			System.out.println(num);
		}
			
		
		
	}

}
