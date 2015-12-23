package com.course.collections;

import java.util.*;

import com.course.shapes.MyPoint;

public class TestMap
{
	public static void main(String[] args)
	{
		Map<String, MyPoint> map = new HashMap<>();
		map.put("gargamel5", new MyPoint(5, 5));
		map.put("gargamel4", new MyPoint(4, 4));
		map.put("gargamel3", new MyPoint(3, 3));
		map.put("gargamel7", new MyPoint(7, 7));
		map.put("gargamel1", new MyPoint(1, 1));
		map.put("gargamel2", new MyPoint(2, 2));
		
		// MyPoint p = (MyPoint)map.get("gargamel3");\
		MyPoint p = map.get("gargamel3");
		
		System.out.println(map.containsKey("gargamel9"));
		//System.out.println(map.get("gargamel2"));
		// System.out.println(map);
		printMap(map);
	}
	
	public static void printMap(Map<String, MyPoint> map)
	{
		// use keys
		System.out.println("************** KEYS ***************");
		Set<String> keys = map.keySet();
		for (String key : keys)
		{
			// prints the key and the associated value
			System.out.println(key + " == " + map.get(key));
		}
		
		// use values
		System.out.println("************** VALUES ***************");
		Collection<MyPoint> values = map.values();
		for (MyPoint val : values)
		{
			System.out.println(val);
		}
		
		// use entries
		System.out.println("************** ENTRIES ***************");
		Set<Map.Entry<String, MyPoint>> entries = map.entrySet();
		for (Map.Entry<String, MyPoint> entry : entries)
		{
			// Downcast in order to get access to specific functions
			// Th is is a terrible situation!!
			//Map.Entry entry = (Map.Entry)theEntry;
			System.out.println(entry.getKey() + " : " + 
						entry.getValue());
		}
	}

}
