package com.course.animals;

public class TestPolymorphism
{

	public static void main(String[] args)
	{
		
		//int num = 0;
		
		//Animal ani = new Animal("ani", 6);
		Bear b = new Bear();
		Cat c = new Cat();
		
		//b.eat();
		
//		feedAnimal(ani);
//		feedAnimal(b);
		feedAnimal(c);
		//feedAnimal(new Dog());
	}
	
	public static void feedAnimal(Animal a)
	{
		// 1. you can only call functions that are 
		// declared in Animal.
		// a.bark();
		// 2. (MAGIC) - If the function is overridden by a subclass -
		// the overridden function will be called
		
		if (a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.bark();
			// ((Dog)a).bark();
		}
		a.eat();
		
	}

}
