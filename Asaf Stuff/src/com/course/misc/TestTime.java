package com.course.misc;

import java.awt.Font;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestTime
{
	public static void main(String[] args) throws Exception
	{
		MyTime time1 = new MyTime(23, 58, 59);
		JFrame f1 = new JFrame();
		JLabel lbl1 = new JLabel();
		lbl1.setFont(new Font("Arial", Font.BOLD, 22));
		
		f1.add(lbl1);
		f1.pack();
		f1.setVisible(true);
		while (true)
		{
			// System.out.println(time1);
			lbl1.setText(time1.toString());
			
			TimeUnit.MILLISECONDS.sleep(100);
			
			time1.nextSecond();
		}
		
		
	
		
		
	}
}
