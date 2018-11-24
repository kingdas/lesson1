package com.yc.java005commonClass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		// 常用类：字符串类
		// String s = "abcd123";

		// byte b = 127;// 一个字节
		// short st;// 二个字节
		// int a = 5;// 四个字节
		// long l = 8;// 八个字节
		//
		// char c = '中';// 占两个字节；一个字节8位；1Byte=8bit;1B=8b;
		// int n = c;
		// System.out.println(c);
		// System.out.println(n);
		// //////////////////////////////////
		// String s = "ab,21,cd1213";
		// char c = s.charAt(6);
		// System.out.println(c);
		// String st = s.substring(1, 3);// [1,3)
		// System.out.println(st);
		// int n = s.indexOf("21");
		// System.out.println(n);
		// n = s.lastIndexOf("21");
		// System.out.println(n);
		// String[] sn = s.split(",");
		// for (String t : sn) {
		// System.out.println(t);
		// }
		// n = s.length();
		// System.out.println(n);
		// st = s.replaceAll("1", "*");// \d,\D,正则表达式
		// System.out.println(s);
		// System.out.println(st);
		// s.trim();// 去掉前后空格
		// System.out.println(s.toUpperCase());// 把字母转成大写
		//
		// System.out.println("abc".equals("AbC"));
		// System.out.println("abc".equalsIgnoreCase("AbC"));
		// System.out.println("aba".compareTo("abc"));// 比较
		//
		// System.out.println(String.format("xx%5d", 25));
		// System.out.println(String.format("x\tx%-8.2f", 25.234));
		// //////////////////////////////////
		// Random r;// 随机类
		// Math m;// 数学函数类
		// System.out.println(Math.abs(-9));// 静态方法可以用类型直接调用
		// System.out.println(Math.random());// [0,1)
		// System.out.println(50 + (int) (Math.random() * 30));// [0,1)
		// System.out.println(Math.pow(2, 16));
		// System.out.println(Math.sin(60));
		// System.out.println(Math.round(5.4));
		// System.out.println(Math.floor(3.9));
		// System.out.println(Math.sqrt(9));
		// System.out.println(Math.PI);
		// System.out.println(Math.ceil(3.1));
		// // //////////////////////////////////
		// Date d = new Date();
		// long t = d.getTime();
		// System.out.println(t);// 1970-01-01 00:00:00.000 为时间零
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		// System.out.println(sdf.format(d));
		// //////////////////////////////////
		// Date d = new Date(0);
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		// System.out.println(sdf.format(d));

	}

}
