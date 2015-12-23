package com.course.shapes;

public class MyCircle
{
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((center == null) ? 0 : center.hashCode());
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyCircle other = (MyCircle) obj;
		if (center == null)
		{
			if (other.center != null)
				return false;
		} else if (!center.equals(other.center))
			return false;
		if (radius != other.radius)
			return false;
		return true;
	}

	//
	// Attributes	
	//
	private MyPoint center;
	private int radius = 1;
	
	//
	// Constructors
	//
	public MyCircle(int x, int y, int radius)
	{
		center = new MyPoint(x, y);
//		center.setX(x);
//		center.setY(y);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius)
	{
		this.center = center;
		this.radius = radius;
	}
	
	//
	// Functions
	//
	public int getRadius()
	{
		return radius;
	}
	
	public void setRadius(int radius)
	{
		if (radius > 0)
			this.radius = radius;
	}
	
	public MyPoint getCenter()
	{
		return center;
	}
	
	public void setCenter(MyPoint center)
	{
		this.center = center;
	}
	
	public void setCenterX(int x)
	{
		center.setX(x);
	}
	
	public void setCenterY(int y)
	{
		center.setY(y);
	}
	
	public void setCenterXY(int x, int y)
	{
		this.center.setX(x);
		this.center.setY(y);
	}
	
	public int getCenterX()
	{
		return center.getX();
	}
	
	public int getCenterY()
	{
		return this.center.getY();
	}
	
	public double getArea()
	{
		return Math.PI * radius * radius;
	}
	
	public String toString()
	{
		return "Circle @ " + center + " radius= " + radius;
	}
}
