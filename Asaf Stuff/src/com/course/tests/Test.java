package com.course.tests;

public class Test 
{
	public static void main(String[] args) 
	{
	
		System.out.println("Shalom");
		printShalom9Times();
		System.out.println("Lehitraot");
		
	}
	
	
	public static void printShalom3Times()
	{
		System.out.println("Shalom");
		System.out.println("Shalom");
		System.out.println("Shalom");
	}
	
	public static void printShalom9Times()
	{
		printShalom3Times();
		System.out.println("------------------");
		printShalom3Times();
		System.out.println("------------------");
		printShalom3Times();
	}
}
