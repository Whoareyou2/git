package com.course.books;

public class TestBookWithArray
{
	public static void main(String[] args)
	{
		Book b1 = new Book("Tzipopo", 17.70);
		
		Author a = new Author("Dani", "dani@dani.com", 'M');
		b1.addAuthor1(a);
		
		b1.addAuthor1(new Author("Rani", "rani@rani.com", 'M'));
		b1.removeAuthor1(1);
//		
		b1.addAuthor1(new Author("Mani", "mani@mani.com", 'M'));
		b1.addAuthor1(new Author("Gani", "gani@gani.com", 'F'));
		
		b1.removeAuthor1(3);
		b1.removeAuthor1(1);
		
		b1.addAuthor1(new Author("Bani", "gani@gani.com", 'F'));
		b1.addAuthor1(new Author("Sani", "gani@gani.com", 'F'));
		b1.addAuthor1(new Author("Kani", "gani@gani.com", 'F'));
		b1.removeAuthor1(1);
		
		
		
		
		b1.printAuthors();
		
		
	}
}
