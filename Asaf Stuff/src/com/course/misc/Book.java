package com.course.misc;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Book implements Serializable
{
	public static int counter = 0;
	//
	// Attributes
	//
	private String title;
	private String author;
	private transient double price;
	
	// Static initializer - this code will be executed ONLY ONCE
	// for this class
	static {
			double num = Math.sin(Math.PI);
		counter = (int)num;
		
	}
	
	//
	// Constructors
	//
	// This function will be called automatically, whenever
	// an object is created
	public Book(String title, String author, double price)
	{
		//System.out.println("BLA BLA BLA");
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
		
		counter++;

	}
	
	public Book()
	{}
	
	//
	// Methods (Functions)
	//
	public void printMe()
	{
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);

	}
	
	// b5.setValues("x", "t", 344);
//	public void setValues(String title, String author, double price)
//	{
//		this.title = title;
//		this.author = author;
//		if (price > 0)
//		{
//			this.price = price;
//		}
//		
//	}
//	
	//
	// Getters and Setters
	//
	public double getPrice()
	{
		return price;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setPrice(double price)
	{
		if (price > 0)
		{
			this.price = price;
		}
//		else
//		{
//			System.out.println("Invalid price! " + price);
//		}
	}
	
	@Override
	public boolean equals(Object obj)
	{
		// Check that we got a book
		if (!(obj instanceof Book))
		{
			return false;
		}
		
		// Downcast
		Book another = (Book)obj;
		
		// Finally - compare the fields one by one
		return this.author.equals(another.author) &&
			   this.title.equals(another.title);

	}
	
	
	public static int getCounter()
	{
		return counter;
	}

	@Override
	public String toString()
	{
		return "Book [title=" + title + ", author=" + author + ", price="
				+ price + "]";
	}
	
	// NOTE: The protocol is defined inside the class
	public void save(DataOutputStream out) throws IOException
	{
		out.writeUTF(title);
		out.writeUTF(author);
		out.writeDouble(price);
	}
	
	public void load(DataInputStream in) throws IOException
	{
		title = in.readUTF();
		author = in.readUTF();
		price = in.readDouble();
	}
	
}
