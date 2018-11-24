package com.yc.java016exception;

//异常：exception--ArithmeticException，
//出现异常时不加以处理的话---程序终止
//处理方式：把可能产生异常的代码放入try语句块中
//产生异常时，会抛出对应的异常对象，
//抛出的此异常对象会被catch中的变量接收到
//catch捕获(处理)异常
//一个try可以有多个catch;
//多个catch顺序要从子到父（否则子在后永不会被执行，也就无意思了），平级可不分顺序
//try-catch不会把一大段代码放入一try中
//finally不管是否产生异常，finally语句块都会被执行（就算遇到return，  正常退出应用程序（System.exit(0)））--一般用作释放资源
//return ;方法无返回值时，结束方法调用的方式
//try可以没有catch;try-finally

//NullPointerException,ArithmeticException,IndexOutOfBoundsException
//注意避免空指针异常：如果是字符串比较，常量放在前面

//当throw一个异常对象时，当前方法throws把异常对象抛给调用处去处理
//RuntimeException，运行时异常不会被强型要求处理

public class Test {

	public static void main(String[] args) {

		// int[] b = { 1, 2 };
		// int a = 0;
		// try {
		// b[2] = 9;
		// a = 2 / a;// 抛出ArithmeticException对象
		// } catch (ArithmeticException e) {
		// System.out.println("..");
		// e.printStackTrace();
		// } catch (IndexOutOfBoundsException e) {
		// System.out.println(".");
		// } catch (Exception e) {// e=new ArithmeticException();
		// System.out.println("...");
		// e.printStackTrace();
		// // System.out.println(e.getMessage());
		// }
		//
		// System.out.println(a);
		// System.out.println("*****");
		// // //////////////////////////
		// int a = 0;
		// try {
		// a = 2 / a;
		// }
		//
		// // catch (Exception e) {
		// // System.out.println(e.getMessage());// 提示用户
		// // // return;
		// // }
		//
		// finally {
		// System.out.println("finally");
		// }
		// System.out.println("***");
		// ///////////////////////////
		// System.out.println(rt());

		// //////////////////////////
		// int a = 0;
		// try {
		// a = 2 / a;
		// } catch (Exception e) {
		// System.out.println(e.getMessage());// 提示用户
		// // return;
		// System.exit(0);// 正常退出应用程序
		// } finally {
		// System.out.println("finally");
		// }
		// System.out.println("***");

		// // /////////////////////////////
		// String username = null;
		// String password = null;
		// boolean b = false;
		// try {
		// b = login(username, password);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// /////////////////////////////
		String username = "admin";
		String password = "admin";
		boolean b = false;
		try {
			b = login(username, password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(b);

	}

	static boolean login(String username, String password) {

		if (!"admin".equals(username)) {
			throw new LoginException("用户名不存在");
		}
		if (!"admin".equals(password)) {
			throw new LoginException("密码错误");
		}

		return true;
	}

	// static boolean login(String username, String password) throws Exception {
	// // if (username.equals("admin") && "admin".equals(password)) {
	// // if ("admin".equals(username) && "admin".equals(password)) {
	// // return true;
	// // } else {
	// // return false;
	// // }
	// if (!"admin".equals(username)) {
	// throw new Exception("用户不存在");
	// }
	//
	// return true;
	// }

	static int rt() {
		int a = 0;
		try {
			a = 2 / a;
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}

}
