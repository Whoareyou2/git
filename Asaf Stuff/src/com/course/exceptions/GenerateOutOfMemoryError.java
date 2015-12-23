package com.course.exceptions;

public class GenerateOutOfMemoryError
{

	public static void main(String[] args)
	{
		// Bigger than the heap size (most of time)
		long[] longs = new long[2_100_000_000];
	}

}
