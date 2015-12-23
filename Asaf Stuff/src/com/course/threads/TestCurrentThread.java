package com.course.threads;

public class TestCurrentThread
{
	public static void main(String[] args)
	{
		printTheThreadThatCalledMe();
		
		
		Whatever r1 = new Whatever();
		Thread t1 = new Thread(r1, "kuki");
		t1.start();
		
		new Thread(new Whatever(), "jimi").start();
		new Thread(new Whatever(), "moti").start();
		new Thread(new Whatever(), "aja").start();
		new Thread(new Whatever(), "kuki").start();
		
//		new Thread(new Runnable()
//		{
//			public void run()
//			{
//				printTheThreadThatCalledMe();
//			}
//		}, "jimi").start();
		
		
	}
	
	public static void printTheThreadThatCalledMe()
	{
		System.out.println(Thread.currentThread().getName() + 
				" called me");
	}

}

class Whatever implements Runnable
{
	@Override
	public void run()
	{
		TestCurrentThread.printTheThreadThatCalledMe();
	}
}
