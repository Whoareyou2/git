package com.course.threads;

public class TestThreads1
{
	public static void main(String[] args)
	{
		// NEVER CALL RUN DIRECTLY
		// r1.run();
		HelloRunner r1 = new HelloRunner();
		Thread t1 = new Thread(r1, "Gargamel");
		//t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		
		
		HelloRunner r2 = new HelloRunner();
		Thread t2 = new Thread(r2, "Dardasaba");
		t2.start();
		
		HelloRunner r3 = new HelloRunner();
		Thread t3 = new Thread(r3, "Dardasit");
		//t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		r1.pleaseDie();
		
		System.out.println("Back in main");
	}
}

class HelloRunner implements Runnable
{
	private boolean stopRequested = false;
	private int i;
	// This will be like a 'main' function for new threads
	public void run()
	{
		i = 0;
		
		while (!stopRequested)
		{
			System.out.println(Thread.currentThread().getName() + 
					" Hello " + i++);
			if (i == 50)
			{
				break;
			}

			try
			{
				Thread.sleep(1);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			 
			//Thread.yield();
		}
		
		// clean up code
		System.out.println("Bye bye");
	}
	
	public void pleaseDie()
	{
		stopRequested = true;
	}
}
