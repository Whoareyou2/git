package com.course.misc;
public class loop5
{
	public static void main(String[] args)
	{

		int num1 = (int) (Math.random() * 10001);
		System.out.println("num1 is " + num1);

		printTheNumberOfDigits(num1);
		printTheLeftMostDigit(num1);
		printTheSumOfDigits(num1);
		reverse(num1);
		
		// 1. Count the number of digits
		int count = 1;
		double temp = 0;
		for (int i = 10; i < 10000; i *= 10)
		{
			temp = (num1 / i);
			if (temp > 0)
			{
				count++;
			}

		}

		System.out.println("number of digits " + count);

		// 2. the left most digit
		// 3. and sum, and reverse
		int sum = 0;
		int newnum = 0;
		int temp2;

		if (count == 1)
		{
			temp2 = num1;
			sum = num1;
			newnum = num1;
		} else if (count == 2)
		{
			temp2 = num1 / 10;
			sum = temp2 + (num1 % 10);
			newnum = (temp2) + ((num1 % 10) * 10);
		} else if (count == 3)
		{
			temp2 = num1 / 100;
			sum = temp2 + (num1 % 10) + ((num1 % 100) / 10);
			newnum = temp2 + ((num1 % 10) * 100) + (((num1 % 100) / 10) * 10);
		}

		else
		{

			temp2 = num1 / 1000;
			sum = temp2 + (num1 % 10) + ((num1 % 100) / 10)
					+ ((num1 % 1000 / 100));
			newnum = temp2 + ((num1 % 10) * 1000) + ((num1 % 100 / 10) * 100)
					+ ((num1 % 1000 / 100) * 10);
		}

		System.out.println("the first left digit  " + temp2);
		System.out.println("sum of the numbers digits  " + sum);
		System.out.println("opposite order of the numbers digits  " + newnum);

	}

	public static void printTheNumberOfDigits(int num)
	{
		int count = 0;
		int temp = num;
		while (temp != 0)
		{
			temp = temp / 10;
			count++;
		}
		System.out.println("Number of digits = " + count);

	}

	public static void printTheLeftMostDigit(int num)
	{
		// left digit another way
		int temp = num;
		while (temp > 10)
		{
			temp = temp / 10;
		}
		System.out.println("Left digit = " + temp);
	}

	public static void printTheSumOfDigits(int num)
	{
		// left digit another way
		int sum = 0;
		int temp = num;
		while (temp > 0)
		{
			sum += temp % 10;
			temp = temp / 10;
		}
		System.out.println("Sum = " + sum);
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
		System.out.println("Reverse : " + reverse);
		return reverse;

	}

}
