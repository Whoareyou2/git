package com.course.misc;

public class TestWrappersHorror
{
	public static void main(String[] args)
	{
		// Terrible. Just terrible!
		long startTime = System.nanoTime();
		
		long sum = 0L;
		for (int i = 0; i < Integer.MAX_VALUE; i++)
		{
			sum += i;
		}
		
		System.out.println("Sum = " + sum);
		
		long endTime = System.nanoTime();
		
		System.out.println((endTime - startTime)/ Math.pow(10, 9));
		
	}

}
