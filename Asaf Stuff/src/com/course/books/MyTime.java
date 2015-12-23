package com.course.books;

public class MyTime
{

	private int hour = 0;
	private int min = 0;
	private int sec = 0;

	public MyTime(int hour, int min, int sec)
	{
		setTime(hour, min, sec);

	}

	public void setTime(int hour, int min, int sec)
	{
		setSec(sec);
		setHour(hour);
		setMin(min);

	}

	public int getHour()
	{
		return hour;

	}

	public int getMin()
	{
		return min;
	}

	public int getSec()
	{
		return sec;
	}

	public void setHour(int hour)
	{
		this.hour = hour;
		if (hour > 0 && hour <= 24)
		{
			this.hour = hour;
		} else
		{
			System.out.println("Invalid hour");
		}
	}

	public void setMin(int min)
	{
		this.min = min;
		if (min > 0 && min <= 60)
		{
			this.min = min;
		} else
		{
			System.out.println("Invalid min");
		}
	}

	public void setSec(int sec)
	{
		this.sec = sec;
		if (sec > 0 && sec <= 60)
		{
			this.sec = sec;
		} else
		{
			System.out.println("Invalid sec");
		}
	}

	public String toString()
	{
		return hour + ":" + min + ":" + sec;
	}

	public MyTime nextSec()
	{
		sec++;
		if (sec > 59)
		{
			sec = 0;
			Nextmin();
		}
		return this;

	}

	public MyTime Nextmin()
	{
		min++;
		if (min > 59)
		{
			min = 0;
			NextHour();
		}
		return this;
	}

	public MyTime NextHour()
	{
		hour++;
		if (hour > 23)
		{
			hour = 0;

		}
		return this;
	}

}
