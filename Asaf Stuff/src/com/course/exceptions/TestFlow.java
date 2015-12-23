package com.course.exceptions;

import java.io.IOException;

public class TestFlow
{
	public static void main(String[] args)
	{
		System.out.println("In main");
		f1();
		System.out.println("Back in main");
	}
	public static void f1()
	{
		System.out.println("In f1");
		try
		{
			f2();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e);
		}
		
		System.out.println("Back in f1");
	}
	public static void f2() throws IOException{
		System.out.println("In f2");
		f3();
		System.out.println("Back in f2");
	}
	public static void f3() throws IOException{
		System.out.println("In f3");
		throw new IOException("I have nothing to say");
		//throw new MyException("bla bla bla bla bla");
		//System.out.println("Back in f3");
	}

}
