package com.course.books;


public class MyTimeTest {

	public static void main(String[] args) {
		MyTime time1=new MyTime(-234243,-45659,1);
		System.out.println(time1);
		
		// time1.NextHour().Nextmin().Nextmin().nextSec().nextSec().nextSec();
		
		
		for (int i = 0; i < 6000; i++) {
			
			
			time1.nextSec();
			System.out.println(time1);
		}
		
	}
}
