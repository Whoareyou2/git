package com.course.shapes;

public class MyPoint implements Comparable<MyPoint>
{
	//
	// attributes
	//
	private int x = 0;
	private int y = 0;
	
	//
	// Constructors
	//
	public MyPoint()
	{
	}
	
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	//
	// functions
	// 
	
	public int getX()
	{
		return x;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setXY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public String toString()
	{
		return "(" + x + "," + y + ")";
	}
	
	//System.out.println(p1.distance(3, 4));
	public double distance(int x, int y)
	{
		int xGap = this.x - x;
		int yGap = this.y - y;
		
		return Math.sqrt(xGap * xGap + yGap * yGap);
	}
	
	//System.out.println(p1.distance(p2));
	public double distance(MyPoint other)
	{
		return distance(other.x, other.y);
	}
	
	
//	int xGap = this.x - anotherPoint.x;
//	int yGap = this.y - anotherPoint.y;
//	
//	return Math.sqrt(xGap * xGap + yGap * yGap);
	
	@Override
	public boolean equals(Object obj)
	{
		// Check that we got a point
		if (!(obj instanceof MyPoint))
		{
			return false;
		}
		
		// Now we know it is a MyPoint - downcast
		MyPoint other = (MyPoint)obj;
		
		return (this.x == other.x &&
			    this.y == other.y);
		
	}

	//
	// Comparable implementation
	//
	// Return positive number if 'this' > 'other'
	// Return negative number if 'this' < 'other'
	// Return zero if they are equal
	public int compareTo(MyPoint other)
	{
		if (this.x > other.x) return 1;
		if (this.x < other.x) return -1;
		return 0;
		
		//return (this.y > other.y)? 1 : (this.y < other.y) ? -1 : 0;
		
		//return (this.x - other.x);
		
	}
	
	
}
