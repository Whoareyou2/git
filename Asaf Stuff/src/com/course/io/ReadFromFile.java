package com.course.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile
{
	public static void main(String[] args) 
	{
		// ARM - Auto Resource Management
		// Any resource that was opened inside the try - will be
		// automatically closed by the system
		try(BufferedReader in = 
				new BufferedReader(new FileReader("kuku.txt")))
		{
			String line1 = in.readLine();
			String line2 = in.readLine();
			
			System.out.println(line1);
			System.out.println(line2);
			
		}catch (FileNotFoundException e)
		{
			System.out.println("File not found");
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
