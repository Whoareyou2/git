package com.course.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ReduceArrayToUniqueValues
{
	public static void main(String[] args)
	{
		List myList = new LinkedList();
		Collections.addAll(myList, 4, 3, 5, 3, 5, 3, 5, 35, 
				6, 4, 56,43);
		
		System.out.println("Original: " + myList);
		System.out.println("Reduced" + reduce(myList));
	}
	
	public static Set reduce(List list)
	{
		return new HashSet(list);
	}

}
