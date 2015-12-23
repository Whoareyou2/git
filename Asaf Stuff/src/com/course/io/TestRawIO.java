package com.course.io;

import java.io.*;

public class TestRawIO
{
	public static void main(String[] args)
	{
		// Opens a file in read mode
		try
		{
			FileInputStream in = 
					new FileInputStream("config.txt");
			
			int bytesRead = 0;
			byte[] buff = new byte[256];
			
			// Every read will (try to) fill the entire buffer
			while ((bytesRead = in.read(buff)) > -1)
			{
				System.out.println(bytesRead);
//				String str = new String(buff);
//				System.out.println(str);
			}
			
			in.close();
		
		
		
		} catch (FileNotFoundException e)
		{
			System.out.println("File not found...");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	

}
