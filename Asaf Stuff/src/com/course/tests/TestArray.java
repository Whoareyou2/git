package com.course.tests;

public class TestArray
{
	public static void main(String[] args)
	{
		int[] intArr = new int[900];
		
//		intArr[0] = 12;
//		intArr[1] = 1;
//		intArr[2] = 12;
//		intArr[3] = 2;
//		intArr[4] = 15;
		
		// init array values
		for(int i = 0; i < intArr.length; i++)
		{
			intArr[i] = i;
		}
		
		// print array values
		for (int i = 0; i < intArr.length; i++)
		{
			System.out.println("arr[" + i + "] = " + intArr[i]);
		}
		
		
	}
}
