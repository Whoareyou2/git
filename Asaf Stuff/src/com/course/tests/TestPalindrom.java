package com.course.tests;

public class TestPalindrom
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 100000; i++)
		{
			int num = (int)(Math.random() * 1000000);
			if (isPolindrom(num))
			{
				System.out.println(num);
			}
		}
		
	}
	
	
	public static boolean isPolindrom(int num)
	{
		return (num == reverse(num));
	}
	// Return the reverse number of the given num
	public static int reverse(int num)
	{
		int reverse = 0;
		int temp = num;
		while (temp > 0)
		{
			reverse = reverse * 10 + temp % 10;
			temp = temp / 10;
		}
		//System.out.println("Reverse : " + reverse);
		return reverse;

	}
}
