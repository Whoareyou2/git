package com.course.io;

import java.io.*;

public class CopyFile
{
	public static void main(String[] args)
	{
		try
		{
			//copyFile("config.txt", "writeme.txt");
			 copyFile("Koala.jpg", "Koala2.jpg");
		
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void copyFile(String src, String dest) throws IOException
	{
		
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dest);
		
		int bytesRead= 0;
		byte[] buff = new byte[256];
		
		// Every read will (try to) fill the entire buffer
		while ((bytesRead = in.read(buff)) > -1)
		{
			// Write the buff to the output stream (file)
			// writes from 0 to bytesread
			// writes only the number of bytes that was read
			out.write(buff, 0, bytesRead);
		}
		
		in.close();
		out.close();
	}

}
