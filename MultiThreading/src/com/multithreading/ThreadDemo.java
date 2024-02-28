package com.multithreading;

public class ThreadDemo {
	public static void printHello()
	{
		System.out.println("printhello:" +Thread.currentThread());
		for(int i=1;i<=3;i++)
		{
			System.out.println("hello");
		}
	}
	public static void printOdd()
	{
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
			System.out.println("PrintOdd:"+Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t);
		printHello();
		System.out.println(Thread.currentThread());
		printOdd();
		

	}

}
