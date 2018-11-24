package com.yc.java012Inheritence1;

public class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// @Override
	// public String toString() {
	// // return "Point [x=" + x + ", y=" + y + "]";
	// return x + "," + y;
	// }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public static void main(String[] args) {
		// Point p = new Point(1, 2);
		// System.out.println(p);
		// System.out.println(p.toString());
		// //////////////////////////
		// Point p1 = new Point(1, 2);
		// Point p2 = new Point(1, 2);
		// Point p3 = p1;
		// System.out.println(p1 == p2);
		// System.out.println(p1 == p3);
		// System.out.println(p1.equals(p2));
		// //////////////////////////////
		// ==比较两个对象内存中的地址是否相同；是否是同一个对象
		// equals是Object对象方法，默认实现是比较是否是同一个对象；
		// 一般我们都会去重写，目的是比较两个对象内容是否相同
		// ////////////////////////////////
		// int a=5;
		// Integer i1 = 3;// int 包装器类
		// Integer i2 = new Integer(3);
		// System.out.println(i1 == i2);
		// System.out.println(i1.equals(i2));
		// 基本数据类型对应的包装器类，都重写了Object的equals方法
		// /////////////////////////////
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = "abc";
		System.out.println(s2 == s3);// false

	}
}
