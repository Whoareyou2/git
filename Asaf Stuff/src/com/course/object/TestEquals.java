package com.course.object;

import com.course.animals.Cat;
import com.course.misc.Book;
import com.course.shapes.MyPoint;

public class TestEquals
{
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint(12, 15);
		MyPoint p2 = new MyPoint(12, 15);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(new Cat()));
		System.out.println(p1.equals(p2));
		
		System.out.println("******************************");
		Book b1 = new Book("Tzipopo in Paris", 
				"Tamar Borenstein Lazar", 19.90);
		Book b2 = new Book("Tzipopo in Paris", 
				"Tamar Borenstein Lazar", 119.90);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		
	}

}
