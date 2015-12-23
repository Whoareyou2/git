package com.course.books;


public class TestAuthor
{
	public static void main(String[] args)
	{
		Author a1 = new Author("author1", "author@author.com", 'M');
		System.out.println(a1.toString());
		
		a1.setEmail("author1.com.com");
		System.out.println(a1.toString());
		
		a1.setEmail("author1@com.c@@@om.ku@@@@kuriku");
		System.out.println(a1.toString());
		
		Author a2 = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		System.out.println(a2);   // call toString()
		
		
		
		a2.setEmail("paul@nowhere.com");
		System.out.println(a2);
		
		//
		//
		//
		
//		Book b1 = new Book("Kofiko", a2, 50);
//		Book b2 = new Book("Tzipopo", a1, 445);
//		
//		System.out.println(b1.toString());
//		
//		System.out.println(b1.getAuthor().getName());
//		
//		////////////////////////////////////////////////////
//		Book b3 = 
//				new Book("Danidin", new Author("On Sarig", "gg@gg", 'F') , 56);
//		
//		System.out.println(b3);
		
	} 
	
}
