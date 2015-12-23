package com.course.object;


import com.course.animals.Dambo;
import com.course.animals.FlyingFish;
import com.course.animals.IFlyer;
import com.course.shapes.exercise.Frisbi;

public class TestFlyer
{

	public static void main(String[] args)
	{
		doSomething(new Frisbi());
		doSomething(new Dambo());
		doSomething(new FlyingFish());
		
	}
	
	public static void doSomething(IFlyer f)
	{
		f.fly();
	}

}
