package com.yc.thread;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// MyThread mt = new MyThread();
		// // mt.run();//不能直接调用，如果直接调用那么就是单线程运行！
		// mt.start();// 启动线程，会自动调用run方法
		// // mt.run();
		// System.out.println(Thread.currentThread().getName());
		// //////////////////////////
		// MyThread mt = new MyThread();
		// // mt.start();
		// Thread t = new Thread(mt, "mt");
		// t.start();
		// //////////////////////////
		Sell s = new Sell();
		Thread t1 = new Thread(s, "窗口一");
		t1.start();
		Thread t2 = new Thread(s, "窗口二");
		t2.start();
		Thread t3 = new Thread(s, "窗口三");
		t3.start();

	}

}
