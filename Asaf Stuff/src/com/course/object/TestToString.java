package com.course.object;

import com.course.misc.Book;

public class TestToString
{
	public static void main(String[] args)
	{
		Book b = new Book("tutu", "kuku", 9);
		System.out.println(b.toString());
		
		// com.course.misc.Book@15db9742 
		// this is an indication that someone forgot to
		// override toString
		
	}

}
