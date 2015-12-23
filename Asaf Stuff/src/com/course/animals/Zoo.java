package com.course.animals;

public class Zoo
{
	//
	// Attributes
	//
	private Animal[] animals = new Animal[100];
	private int numOfAnimals = 0;

	//
	// Functions
	//
	public void addAnimal(Animal a)
	{
		animals[numOfAnimals++] = a;
	}
	
	// Lunch time - feed all animals
	public void feedAnimals()
	{
		for (int i = 0; i < numOfAnimals; i++)
		{
//			// NEVER DOWNCAST WITHOUT A CHECK!!
//			if (animals[i] instanceof Dog)
//			{
//				// Downcast in order to call bark()
//				// Downcast- only creates a new ref
//				Dog d = (Dog)animals[i];
//				d.bark();
//			}
//			
			animals[i].eat();
		}
	}
	
}
