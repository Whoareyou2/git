package com.course.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.course.misc.Book;

public class TestAutoSerialize
{
	public static void main(String[] args)
	{
		Book b1 = new Book("Harry Potter", "Rolling", 19.90);
		
		// Note: ARM
		try(ObjectOutputStream out = 
				new ObjectOutputStream(new FileOutputStream("book.ser")))
		{
			out.writeObject(b1);
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
		// In another side of the world, Nikolay wants to read the 
		// information
		try (ObjectInputStream in = 
				new ObjectInputStream(
						new FileInputStream("book.ser")))
		{
			Book b2 = (Book)in.readObject();
			
			System.out.println(b1);
			System.out.println(b2);
			
			
		} catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
