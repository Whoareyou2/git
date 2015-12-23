package com.course.exceptions;

public class GenerateStackOverflowError
{
	static int i = 0;
	public static void main(String[] args)
	{
		//while(true)
		System.out.println("Preparing to boom");
		
//		try{
//			BOOM();
//		}catch (Throwable e)
//		{
//			System.out.println("I = " + i);
//		}
	}
	
	public static void BOOM()
	{
		System.out.println(++i);
		BOOM();
	}

}
