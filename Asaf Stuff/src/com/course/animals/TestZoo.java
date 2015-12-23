package com.course.animals;

public class TestZoo
{

	public static void main(String[] args)
	{
		Zoo zoo = new Zoo();
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Bear());
		zoo.addAnimal(new Wolf());
		zoo.addAnimal(new Mouse());
		//zoo.addAnimal(new Animal("sdfg", 8));
		zoo.addAnimal(new Bear());
		zoo.addAnimal(new Snake());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Cat());
		zoo.addAnimal(new Mouse());
		zoo.addAnimal(new Zebra());
		zoo.addAnimal(new Fish());
		
		zoo.feedAnimals();

		
		
	}

}
