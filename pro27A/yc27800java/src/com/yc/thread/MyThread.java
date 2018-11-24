package com.yc.thread;

//public class MyThread extends Thread// implements Runnable//
//{
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
//	}
//}

public class MyThread implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
