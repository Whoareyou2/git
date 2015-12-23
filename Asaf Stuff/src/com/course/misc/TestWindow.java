package com.course.misc;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestWindow
{
	public static void main(String[] args)
	{
		JFrame f1 = new JFrame();
		
		
		
		f1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		f1.setBounds(100, 200, 300, 500);
		f1.setAlwaysOnTop(true);
		f1.getContentPane().setBackground(Color.orange);
		f1.setVisible(true);

		JFrame f2 = new JFrame();

		JButton btn = new JButton("Ok");
		f2.add(btn);
		f1.getContentPane().setBackground(Color.blue);
		f2.setBounds(900, 200, 300, 500);
		f2.setVisible(true);

	}
}
