package com.course.io;

import java.io.*;

public class CopyFileText
{
	public static void main(String[] args)
	{
		try
		{
			copyFile("config.txt", "writeme.txt");
			//copyFile("Koala.jpg", "Koala2.jpg");
		
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void copyFile(String src, String dest) throws IOException
	{
		
		FileReader in = new FileReader(src);
		FileWriter out = new FileWriter(dest);
		
		int charsRead= 0;
		char[] buff = new char[256];
		
		// Every read will (try to) fill the entire buffer
		while ((charsRead = in.read(buff)) > -1)
		{
			// Write the buff to the output stream (file)
			// writes from 0 to charsread
			// writes only the number of bytes that was read
			out.write(buff, 0, charsRead);
		}
		
		in.close();
		out.close();
	}

}
