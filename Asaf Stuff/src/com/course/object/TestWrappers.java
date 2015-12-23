package com.course.object;

public class TestWrappers
{

	public static void main(String[] args)
	{
		// ints
		Integer in = new Integer(54);
		int num = 54;
		
		int innum = in.intValue();
		
		// boolean
		Boolean b = new Boolean(true);
		boolean b2 = b.booleanValue();
		
		///////////////////////////////////
		//////////////////////////////////
		// auto boxing and unboxing
		Boolean b3 = true; // auto boxing
		boolean b4 = b3; // auto unboxing
		
		// Chars
		Character c = 'y'; // new Character('y');
		char c2 = c; // c.charValue();
		
		test(44);
		test('k');
		test(5.5);
	}
	
	public static void test(Object o)
	{
		
	}

}
