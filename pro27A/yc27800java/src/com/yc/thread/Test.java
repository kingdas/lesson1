package com.yc.thread;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// MyThread mt = new MyThread();
		// // mt.run();//����ֱ�ӵ��ã����ֱ�ӵ�����ô���ǵ��߳����У�
		// mt.start();// �����̣߳����Զ�����run����
		// // mt.run();
		// System.out.println(Thread.currentThread().getName());
		// //////////////////////////
		// MyThread mt = new MyThread();
		// // mt.start();
		// Thread t = new Thread(mt, "mt");
		// t.start();
		// //////////////////////////
		Sell s = new Sell();
		Thread t1 = new Thread(s, "����һ");
		t1.start();
		Thread t2 = new Thread(s, "���ڶ�");
		t2.start();
		Thread t3 = new Thread(s, "������");
		t3.start();

	}

}
