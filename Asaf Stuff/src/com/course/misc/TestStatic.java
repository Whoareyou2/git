package com.course.misc;

public class TestStatic
{
	public static void main(String[] args)
	{
		Book b1 = new Book("title1", "author1");
		Book b2 = new Book("title2", "author2");
		Book b3 = new Book("title3", "author3");
		
		Book.counter = 10;
		Book.counter = 20;
		Book.counter = 30;
		
		
		System.out.println(Book.counter);
		
		System.out.println(Book.getCounter());
	}
}
