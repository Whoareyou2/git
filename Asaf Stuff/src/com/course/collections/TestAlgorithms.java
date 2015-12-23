package com.course.collections;

import java.util.*;

import com.course.shapes.MyPoint;

public class TestAlgorithms
{
	public static void main(String[] args)
	{
		List<Integer> intList = new ArrayList<>();
		Collections.addAll(intList, 4, 13, 41, 23, 24, 23, 54, 3, 51, 7, 4, 7, 3,
				88, 3, 2);
		System.out.println(intList);
		
		// Collections.shuffle(intList);
		// System.out.println(Collections.max(intList));
		// Collections.replaceAll(intList, 4, 7777);
		// Collections.reverse(intList);
		// Collections.rotate(intList, 73589);
		// Collections.sort(intList); // uses default comparable implementation
		Collections.sort(intList, new ReverseIntComparator());
				
		// Collections.sort(intList, (o1, o2) -> {return o2 - o1;});
		System.out.println(intList);
		
		//////////////////////////////////////////////////
		List<String> strList = new ArrayList<>();
		Collections.addAll(strList, "Gugu", "bubu", "ZuZu", "shsuhu", 
				"kuku", "Nunu");
		System.out.println(strList);
		Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(strList); //, String.CASE_INSENSITIVE_ORDER);
		System.out.println(strList);
		
		/////////////////////////////////////////////////////
		List<MyPoint> points = new LinkedList<>();
		
		points.add(new MyPoint(-2_000_200_000, 58));
		points.add(new MyPoint(1_000_320_000, 48));
		points.add(new MyPoint(2, 78));
		points.add(new MyPoint(12, 68));
		points.add(new MyPoint(42, 38));

		System.out.println(points);
		Collections.sort(points);
		System.out.println(points);
	}
	
}

class ReverseIntComparator implements Comparator<Integer>
{
	public int compare(Integer o1, Integer o2) {
		// return -o1.compareTo(o2);
		// return o2 - o1;
		
		if (o1 > o2) return -1;
		if (o1 < o2) return 1;
		return 0;
	}
}



