package com.course.books;



public class Book
{
	//
	// Constants 
	//
	private static final int MAX_AUTHORS = 10;
	
	//
	// Attributes
	// 
	private String name = "--undefined--";
	private double price;
	private int quantityInStock = 0;
	
	private Author[] authors = new Author[MAX_AUTHORS];
	private int numOfAuthors = 0;
	
	//
	// Constructor
	//
	public Book(String name, double price)
	{
//		this.name = name;
//		this.author = author;
//		this.price = price;
		this(name, price, 0);
	}
	
	public Book(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantityInStock = quantity;
	}
	
	//
	// Functions	
	//
	// Add a new author to this book, using method A
	public void addAuthor1(Author a)
	{
		// TODO: what if the array is full?
		
		// look for an empty slot to put the author
		for (int i = 0; i < authors.length; i++)
		{
			if (authors[i] == null)
			{
				authors[i] = a;
				numOfAuthors++;
				break;
			}
		}
	}
	
	// remove an author from an the given index
	public void removeAuthor1(int index)
	{
		// Check that the index is valid
		if (index > 0 && index <= authors.length)
		{
			if (authors[index - 1] != null)
			{
				authors[index - 1] = null;
				numOfAuthors--;
			}
		}
		else
		{
			// TODO: Throw exception to the rude client's face
		}
		
	}
	
	// Add a new author to this book, using method B
	public void addAuthor2(Author a)
	{
		// TODO: What if the array is full 
		
		authors[numOfAuthors++] = a;
	}
	
	// Remove a new author to this book, using method B
	public void removeAuthor2(int index)
	{
		// Check that the index is valid
		if (index > 0 && index <= authors.length)
		{
			if (authors[index - 1] != null)
			{
				//authors[index - 1] = null;
				
				// Place the last book instead of the deleted book
				authors[index - 1] = authors[numOfAuthors - 1];
				authors[numOfAuthors - 1] = null;
				numOfAuthors--;
			}
		}
		else
		{
			// TODO: Throw exception to the rude client's face
		}
	}
		
	
	
	
	public int getNumOfAuthors()
	{
		return numOfAuthors;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getQuantityInStock()
	{
		return quantityInStock;
	}
	
	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		if (price > 0)
		{
			this.price = price;
		}
		// TODO: punish the rude user!
	}
	
	public void setQuantityInStock(int quantityInStock)
	{
		if (quantityInStock > 0)
		{
			this.quantityInStock = quantityInStock;
		}
		// TODO: punish the rude user!
	}
	
	
	public String toString()
	{
		return "'" + this.name;
	}
	
	public void printAuthors()
	{
		System.out.println("Authors: ");
		for (int i = 0; i < authors.length; i++)
		{
			System.out.print("Author " + i + " : ");
			
			if (authors[i] != null)
			{
				System.out.println(authors[i].getName());
			}
			else
			{
				System.out.println("null");
			}
		}
	}
	
	
}
