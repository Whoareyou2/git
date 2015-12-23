package com.course.animals;

public class Bear extends Animal
{
	private int numOfSleepingMonths = 6;
	
	//
	// Constructors
	//
	
	public Bear(String name, int age)
	{
		super(name, age);
	}
			
	public Bear(String name, int age, int months)
	{
		super(name, age);
		this.numOfSleepingMonths = months;
		
	}
	
	public Bear(String name)
	{
		super(name, 1);
		
	}
	
	public Bear()
	{
		super("Dubi", 8);
	}
					
	
	public String toString()
	{
		return super.toString() + 
				" SleepingMonths " + numOfSleepingMonths;
	}

	@Override
	public void eat()
	{
		System.out.println("Bear eating");
		
	}
}
