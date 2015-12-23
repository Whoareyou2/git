package com.course.tests;

public class TestMatrix
{
	public static void main(String[] args)
	{
		int[][] matrix = new int[10][10];
		
		// init the matrix with multiplication table
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix.length; j++)
			{
				matrix[i][j] = (i + 1) * (j + 1);
			}
		}
		
		// print the matrix
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix.length; j++)
			{
				System.out.printf("%4d", matrix[i][j]); 
			}
			// new line
			System.out.println();
		}
		
		
	}
}
