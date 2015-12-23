package com.course.collections;

import java.util.*;

import com.course.shapes.MyPoint;

public class TestList
{

	public static void main(String[] args)
	{
		List<String> myList = new ArrayList<>();
		//myList.add(100);
		myList.add("gargamel");
		//myList.add(100);
		//myList.add(new MyPoint(1, 4));
		//myList.add(100);
		myList.add("kukuriku");
		myList.add("kukuriku");
		myList.add("2kukuriku");
		myList.add("3kukuriku");
		myList.add("kukuriku");
		
		
		//String str = myList.get(2);
		
		// System.out.println(myList);
		printList(myList);
	}
	
	public static void printList(List<String> list)
	{
		// 1. use regular for (BAD... hint: only for LinkedList)
		for (int i = 0; i < list.size(); i++)
		{
			String element = list.get(i);
			System.out.println(i + " : " + element);
		}
		System.out.println("**************************");
		
		// 2. use for each (much better)
		for (String element : list)
		{
			System.out.println(element);
		}
		
		// 3. iterators
		Iterator<String> iter = list.iterator();
		while (iter.hasNext())
		{
			String str = iter.next();
			System.out.println(str);
		}
		
		
	}

}
