package com.course.exceptions;

public class MyException extends RuntimeException
{
	private int theTimeItHappend = 0;
	private int index = 0;
	
	
	public MyException()
	{
		super();
	}

	public MyException(String message)
	{
		super(message);
	}

	
	public MyException(int theTimeItHappend, int index)
	{
		super();
		this.theTimeItHappend = theTimeItHappend;
		this.index = index;
	}

	public int getIndex()
	{
		return index;
	}
	
	public int getTheTimeItHappend()
	{
		return theTimeItHappend;
	}
	
}
