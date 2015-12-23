package com.course.io;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EasyWriteToFile
{
	public static void main(String[] args) throws Exception
	{
//		PrintWriter out = 
//				new PrintWriter(new FileWriter("kuku.txt"));
		
		PrintWriter out = new PrintWriter("kuku2.txt");
		out.println("Hello");
		out.println("Hello");
		out.println("Hello");
		out.println(5555);
		out.println("Hello");
		out.println('d');
		out.println("Hello");
		out.println("Hello");
		out.println("Hello");
		
		out.close();
		
	}

}
