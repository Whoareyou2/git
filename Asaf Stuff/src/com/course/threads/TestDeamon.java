package com.course.threads;

public class TestDeamon
{

	public static void main(String[] args)
	{
		Thread t1 = new DeamonTestThread();
		t1.setDaemon(true);
		t1.start();
		
		System.out.println("Starting main");
		try
		{
			Thread.sleep(5000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Main finished. What about the process?");
	}
	
}	

class DeamonTestThread extends Thread
{
	@Override
	public void run()
	{
		while (true)
		{
			System.out.println("whatever");
			try{
				Thread.sleep(500);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

