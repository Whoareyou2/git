package com.course.threads;

public class TestThreads2
{
	public static void main(String[] args)
	{
		// NEVER CALL RUN DIRECTLY
		// r1.run();
				
		Thread t1 = new HelloRunnerThread();
		t1.start();
		
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		new HelloRunnerThread().start();
		
		
		System.out.println("Back in main");
	}
}

class HelloRunnerThread extends Thread
{
	private int i;
	// This will be like a 'main' function for new threads
	public void run()
	{
		i = 0;
		
		while (true)
		{
			System.out.println(Thread.currentThread().getName() + 
					" Hello " + i++);
			if (i == 50)
			{
				break;
			}
			
		}
		
		System.out.println("Bye bye");
	}
}
