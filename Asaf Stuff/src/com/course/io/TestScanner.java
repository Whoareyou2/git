package com.course.io;

import java.io.File;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class TestScanner
{
	public static void main(String[] args) throws Exception
	{
		// A Scanner on String (text)
		Scanner scanner = new Scanner("Hello wonderfull " +
				"(most of the time) world. Have a nice day");
		
//		while(scanner.hasNext())
//		{
//			System.out.println(scanner.next());
//		}
		
		// A Scanner on file
		scanner = new Scanner(new File("config.txt"));
//		while(scanner.hasNextLine())
//		{
//			System.out.println(scanner.nextLine());
//		}
		
		// A Scanner on keyboard
		scanner = new Scanner(System.in);
		System.out.println("please say something:");
		while (scanner.hasNextLine())
		{
			System.out.println(scanner.nextLine());
			System.out.println("again?:");
		}
		
//		scanner = new Scanner(new URL("http://walla.co.il").openStream());
//		PrintWriter pOut = new PrintWriter("walla.html");
//		while(scanner.hasNextLine())
//		{
//			pOut.println(scanner.nextLine());
//		}
		
	}

}
