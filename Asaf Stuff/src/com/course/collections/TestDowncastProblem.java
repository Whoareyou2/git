package com.course.collections;

import java.util.*;

public class TestDowncastProblem
{
	public static void main(String[] args)
	{
		List<Integer> nums = new LinkedList<>();
		nums.add(33);
		nums.add(133);
		//nums.add("Kishkush");
		nums.add(333);
		nums.add(433);
		nums.add(533);
		
		sumList(nums);
		
	}
	
	// Fixed version - uses generics
	public static void sumList(List<Integer> nums)
	{
		int sum = 0;
		for (int num : nums)
		{
			sum += num;
		}
		
		System.out.println("Sum = " + sum);
	}
	
	
// Problematic version - pre generics
//	public static void sumList(List nums)
//	{
//		int sum = 0;
//		for (Object obj : nums)
//		{
//			// if (obj instanceof Integer)
//			sum += (int)obj;
//			
//		}
//		
//		System.out.println("Sum = " + sum);
//	}

}
