package com.course.misc;



public class TestBook
{
	public static void main(String[] args)
	{
		//double num = 5.5;
		
		// Creates an instance of the class book
		Book b1 = new Book("Monk", "Sharma", 19.90);
		//b1.title = "Monk";
		
		b1.setPrice(-100);
		
		Book b2 = new Book("Jinji", "Galila" , 79.80);
		Book b3 = new Book("Kofiko", "Tamar Borenstein Lazar");
		
		System.out.println(b1.getPrice());
		
		b1.printMe();
		
		System.out.println("*************************");
		b2.printMe();
		
		System.out.println(b1.getTitle());
	}
}
