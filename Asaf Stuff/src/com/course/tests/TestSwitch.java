package com.course.tests;

public class TestSwitch
{
	public static void main(String[] args)
	{
		int code = (int)(Math.random() * 4); // 0, 1, 2
		System.out.println("Code : " + code);
		
		switch (code)
		{
			case 0: 
				System.out.println("ZERO");
				break;
			case 1: 
				System.out.println("ONE");
				break;
				
			default:
				System.out.println("PROBABLY TWO");
			
		}
	}
}
