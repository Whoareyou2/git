package com.course.animals;

public class TestDowncast
{
	public static void main(String[] args)
	{
		Animal a = new Dog();
		
		// Downcast - NOTE: it only creates a new ref to 
		// the same object
		Dog d = (Dog)a;
		d.bark();
		
		((Dog)a).bark();
	}

}
