package com.course.io;

import java.util.Scanner;

public class TestAddNumbers
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("please enter first number:");
		
		int num1 = sc.nextInt();
		
		System.out.println("please enter second number:");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}

}
