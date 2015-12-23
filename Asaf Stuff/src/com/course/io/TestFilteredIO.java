package com.course.io;

import java.io.*;
import java.net.URL;

public class TestFilteredIO
{
	public static void main(String[] args) throws Exception
	{
		// Define streams
		URL url = new URL("http://www.ebay.com");
		InputStreamReader fr = new InputStreamReader(url.openStream());
		// InputStreamReader fr = new InputStreamReader(System.in);
		// InputStreamReader fr = new InputStreamReader(System.in);
		//FileReader fr = new FileReader("config.txt");
		BufferedReader bIn = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("whatever.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pOut = new PrintWriter(bw);
		
		// The actual read and write
		String line = null;
		while ((line = bIn.readLine()) != null)
		{
			System.out.println(line);
			pOut.println(line);
		}
		
		bIn.close();
		pOut.flush();
		pOut.close();
	}

}
