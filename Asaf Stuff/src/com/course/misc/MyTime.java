package com.course.misc;

public class MyTime
{

	private int hour = 0;
	private int minute = 0;
	private int second = 0;

	public MyTime(int hour, int minute, int second)
	{

		setTime(hour, minute, second);
		// if((hour<=23 && hour >= 0) && (minute <=59 && minute >=0) &&
		// (second<=59 && second>=0)){
		// this.hour = hour;
		// this.minute = minute;
		// this.second = second;
		// }else{
		// System.out.println("The time that given is invalid");
		// }
	}

	public void setTime(int hour, int minute, int second)
	{

		if ((hour <= 23 && hour >= 0) && (minute <= 59 && minute >= 0)
				&& (second <= 59 && second >= 0))
		{
			this.hour = hour;
			this.minute = minute;
			this.second = second;
		} else
		{
			System.out.println("Invalid hour, minute, or second!");
		}
	}

	public int getHour()
	{
		return hour;
	}

	public int getMinunte()
	{
		return minute;
	}

	public int getSecond()
	{
		return second;
	}

	public void setHour(int hour)
	{
		if (hour <= 23 && hour >= 0)
		{
			this.hour = hour;
		} else
		{
			System.out.println("Invalid hour");
		}
	}

	public void setMinunte(int minute)
	{
		if (minute <= 59 && minute >= 0)
		{
			this.minute = minute;
		} else
		{
			System.out.println("Invalid minute");
		}
	}

	public void setSecond(int second)
	{
		if (second <= 59 && second >= 0)
		{
			this.second = second;
		} else
		{
			System.out.println("Invalid second");
		}
	}

	public String toString()
	{
		String hourStr = (hour > 9) ? "" + hour : "0" + hour;
		String minStr = (minute > 9) ? "" + minute : "0" + minute;
		String secStr = (second > 9) ? "" + second : "0" + second;

		return hourStr + ":" + minStr + ":" + secStr;
	}

	public void nextSecond()
	{
		this.second++;

		if (second == 60)
		{
			this.second = 0;
			nextMinute();
		}
	}

	public void nextMinute()
	{
		this.minute++;

		if (minute == 60)
		{
			this.minute = 0;
			nextHour();
		}
	}

	public void nextHour()
	{
		this.hour = hour + 1;
		if (hour == 24)
		{
			this.hour = 0;
		}
	}

	public void previousSecond()
	{

		this.second = second - 1;

		if (second == -1)
		{
			this.second = 59;
			this.minute = minute - 1;

			if (minute == -1)
			{
				this.minute = 59;
				this.hour = hour - 1;

				if (hour == -1)
				{
					this.hour = 24;
				}
			}
		}
	}

	public void previousMinute()
	{

		this.minute = minute - 1;

		if (minute == -1)
		{
			this.minute = 59;
			this.hour = hour - 1;

			if (hour == -1)
			{
				this.hour = 23;

			}
		}
	}

	public void previousHour()
	{

		this.hour = hour - 1;
		if (hour == -1)
		{
			this.hour = 23;

		}
	}
}
