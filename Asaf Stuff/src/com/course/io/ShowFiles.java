package com.course.io;

import java.io.File;
import java.io.IOException;

public class ShowFiles
{

	public static void main(String[] args)
	{
		try
		{
			showFiles(new File("c:\\"));
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void showFiles(File file) throws IOException
	{
		
	}

}
