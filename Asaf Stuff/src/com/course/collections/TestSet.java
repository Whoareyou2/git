package com.course.collections;

import java.util.*;

import com.course.shapes.MyPoint;

public class TestSet
{

	public static void main(String[] args)
	{
		Set<Integer> mySet = new HashSet<>();
		//mySet.add("kukuriku");
		mySet.add(100);
		//mySet.add("gargamel");
		mySet.add(100);
		mySet.add(120);
		mySet.add(130);
		//mySet.add(new MyPoint(1, 4));
		mySet.add(100);
		//mySet.add("kukuriku");
		
		// System.out.println(mySet);
		printSet(mySet);
	}
	
	public static void printSet(Set<Integer> set)
	{
		// 1. use for each (much better)
		for (int element : set)
		{
			System.out.println(element);
		}
		
		// 3. use iterators
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
