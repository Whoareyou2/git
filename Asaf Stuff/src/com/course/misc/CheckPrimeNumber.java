package com.course.misc;

public class CheckPrimeNumber
{
	public static void main(String[] args)
	{
		// int num = (int)(Math.random() * 101);
		for (int num = 1; num < 1000; num++)
		{
			System.out.println(num + " : " + isPrime(num));
		}
		
	}
	
	// Checks if the given num is a prime number
	public static boolean isPrime(int num)
	{
		boolean prime = true;
		// Try to divide the number to see if it is prime
		for (int div = 2; div <= num / 2; div++)
		{
			if (num % div == 0)
			{
				// this means that the number is not prime
				prime = false;
				break;
				//return false;
			}
		}
		
		return prime;
	}
	
}
