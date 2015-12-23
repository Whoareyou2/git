package com.course.misc;

public class loop7
{
	public static void main(String[] args)

	{
		int num1 = (int) (Math.random() * 10)  + 1;
		System.out.print(num1 + "--> 1");

		// Print the factorial factors of the number
		for (int i = 2; i <= num1; i++)
		{
			System.out.print(" X ");
			System.out.print(i);
		}
		
		System.out.println(" = " + factorial2(num1));
		
	}
	
	public static int factorial2(int x)
	{
		if (x == 1) return 1;
		
		return factorial2(x - 1) * x;
	}
	
	
	public static int factorial(int x)
	{
		
		int atzeret = 1;
		
		for (int i = 2; i <= x; i++)
		{
			atzeret = atzeret * i;
		}
		
		return atzeret;
	}
}
