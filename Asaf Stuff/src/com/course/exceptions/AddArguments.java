package com.course.exceptions;

public class AddArguments
{

	public static void main(String[] args)
	{
		sum("44");
		sum("22", "1x", "66", "45");
		sum("2", "66", "45");
		sum("22", "1b1", "166", "4d5", "777");
		sum("22", "1", "6a6");
		
	}
	
	public static void sum(String... nums)
	{
		int sum = 0;
			for (int i = 0; i < nums.length; i++)
			{
				try{
					sum += Integer.parseInt(nums[i]);
				}
				catch(NumberFormatException e){
					System.out.println("Exception for " + nums[i] + " in index " + i);
				}
				
			}
		
		
		System.out.println("Sum = " + sum);
	}

}
