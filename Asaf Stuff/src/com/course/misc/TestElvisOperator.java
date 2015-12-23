package com.course.misc;

public class TestElvisOperator
{
	public static void main(String[] args)
	{
		int num = (int)(Math.random() * 100);
		
//		String message = "";
//		if (num > 50)
//		{
//			message = "BIG";
//		}
//		else
//		{
//			message = "FALSE";
//		}
		
		String message = (num > 50) ? "BIG" : "SMALL";
		System.out.println(num);
		System.out.println(message);
	}
}
