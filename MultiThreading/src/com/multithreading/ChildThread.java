package com.multithreading;

public class ChildThread extends Thread {
	
	public void run()
	{
		System.out.println("This is task of child thread...");
	}

	public static void main(String[] args) {
//		ChildThread t1=new ChildThread();
//		t1.start();
		ThreadDemo.printHello();
	
	}

}
