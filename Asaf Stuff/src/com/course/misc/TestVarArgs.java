package com.course.misc;

public class TestVarArgs
{

	public static void main(String[] args)
	{
//		int[] whatever = new int[5];
//		whatever[0] = 6;
//		whatever[1] = 6;
//		whatever[2] = 16;
//		whatever[3] = 26;
//		whatever[4] = 36;
//		
//		sum(whatever);
//		
//		int[] whatever2 = {5, 3, 4, 23, 4, 2, 4};
//		sum(whatever2);
		
		sum(3, 2, 3, 2, 4);
		sum(3, 55, 22, 55, 255, 22, 55, 2);
		sum(11);
		sum();
		sum(12, 4, 4, 5, 2, 5, 3);
		
	}
	
	// VARARGS
	public static void sum(int... nums)
	{
		System.out.println(nums.length);
		int sum = 0;
		for (int num : nums)
		{
			sum += num;
		}
		
		System.out.println("Sum = " + sum);
	}

}
