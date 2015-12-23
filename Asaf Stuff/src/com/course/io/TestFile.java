package com.course.io;

import java.io.File;
import java.io.PrintWriter;

public class TestFile
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("momo.txt");
		System.out.println(file.exists());
		//file.createNewFile();
		
		PrintWriter out = new PrintWriter(file);
		out.println("dfghdf");
		out.println("dfghdf");
		out.println("dfghdf");
		out.println("dfghdf");
		out.println("dfghdf");
		out.close();
		
		System.out.println(file.length());
		
		File dir = new File("mydir");
		dir.mkdir();
		File fileInsideDir = new File(dir, "test.dat");
		fileInsideDir.createNewFile();
	}

}
