package com.course.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.course.misc.Book;

public class TestSerializeGooddddd
{
	public static void main(String[] args)
	{
		Book b1 = new Book("Harry Potter", "Rolling", 19.90);
		
		// Note: ARM
		try(DataOutputStream out = 
				new DataOutputStream(new FileOutputStream("book.dat")))
		{
			b1.save(out);
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		// In another side of the world, Nikolay wants to read the 
		// information
		try (DataInputStream in = 
				new DataInputStream(
						new FileInputStream("book.dat")))
		{
			Book b2 = new Book();
			b2.load(in);
			
			System.out.println(b1);
			System.out.println(b2);
			
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
