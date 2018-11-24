package com.yc.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws Exception {
		// File f = new File("d:/a.txt");
		// // System.out.println(f.exists());
		// if (!f.exists()) {
		// f.createNewFile();
		// }
		// System.out.println(f.exists());
		// ///////////////////////////
		// \n\t
		// File fp = null;
		// File f = new File("d:\\a/b" + File.separator + "a.txt");
		// System.out.println(f.exists());
		// if (!f.exists()) {
		// fp = f.getParentFile();
		// if (!fp.exists()) {
		// // fp.mkdir();//创建目录
		// fp.mkdirs();
		// }
		// f.createNewFile();// 创建文件
		// }
		// System.out.println(f.exists());
		// fp = f.getParentFile();
		// System.out.println(fp.getName());
		// System.out.println(fp.getAbsolutePath());
		// System.out.println(fp.isDirectory());
		// System.out.println(f.isDirectory());
		// long t = f.lastModified();
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
		// System.out.println(sdf.format(new Date(t)));
		// // ////////////////////////
		// String path = "d:/a";
		// File f = new File(path);
		// File[] fs = f.listFiles();
		// for (File ft : fs) {
		// if (ft.isDirectory()) {
		// System.out.println("[" + ft.getName() + "]");
		// } else {
		// System.out.println(ft.getName());
		// }
		// }
		// ////////////////////////
		// 显示某个目录下的，所有文件及文件夹（包括子文件夹下的所有）
		// // ///////////////////////////////////
		// File f = new File("d:/a/b/a.txt");
		// InputStream is = new FileInputStream(f);// 输入流，
		// int t = is.read();
		// System.out.println((char) t);
		// is.close();
		// ///////////////////////////////////
		// File f = new File("d:/a/b/a.txt");
		// OutputStream os = new FileOutputStream(f);
		// os.write(97);
		// os.write(98);
		// os.write(99);
		// os.close();
		// // // ///////////////////////////////////
		// // File f = new File("d:/a/b/a.txt");
		// InputStream is = new FileInputStream(f);// 输入流，
		// int t = 0;
		// while ((t = is.read()) != -1) {// -1文件的结尾
		// System.out.print((char) t);
		// }
		// is.close();
		// // ///////////////////////
		// File fd = new File("d:/a/b/a.jpg");
		// File fs = new File("d:/a/b/aa.jpg");
		// InputStream is = new FileInputStream(fs);
		// OutputStream os = new FileOutputStream(fd);
		// if (!fd.exists()) {
		// fd.createNewFile();
		// }
		// int t;
		// while ((t = is.read()) != -1) {
		// os.write(t ^ '天');
		// }
		// is.close();
		// os.close();
		// // // ///////////////////////////////////
		// File fs = new File("d:/abc/rrr.rar");
		// File fd = new File("d:/a/ycyc.rar");
		// InputStream is = new FileInputStream(fs);
		// BufferedInputStream bis = new BufferedInputStream(is);
		// OutputStream os = new FileOutputStream(fd);
		// BufferedOutputStream bos = new BufferedOutputStream(os);
		// if (!fd.exists()) {
		// fd.createNewFile();
		// }
		// int len;
		// byte[] buff = new byte[1024];
		// long time = new Date().getTime();
		// while ((len = bis.read(buff)) != -1) {
		// bos.write(buff, 0, len);
		// // os.flush();// 清缓存
		// }
		// System.out.println(new Date().getTime() - time);// 35559,47
		// // 4977,639
		// bis.close();
		// bos.close();// 关前会自动调用flush();
		// // // ///////////////////////////////////
		//
		// File fd = new File("d:/a/z.txt");
		// OutputStream os = new FileOutputStream(fd);
		// BufferedOutputStream bos = new BufferedOutputStream(os);
		// DataOutputStream dos = new DataOutputStream(bos);
		// //装饰器设计模式
		// dos.writeBoolean(true);
		// dos.writeDouble(3.14);
		// dos.writeChar('中');
		// dos.close();
		//
		// File fs = new File("d:/a/z.txt");
		// InputStream is = new FileInputStream(fs);
		// BufferedInputStream bis = new BufferedInputStream(is);
		// DataInputStream dis = new DataInputStream(bis);
		// boolean b = dis.readBoolean();
		// double d = dis.readDouble();
		// char c = dis.readChar();
		// System.out.println(b + "," + d + "," + c);
		// dis.close();

		// // // ///////////////////////////////////
		// User u = new User(22, "zs");
		// File fd = new File("d:/a/z.txt");
		// OutputStream os = new FileOutputStream(fd);
		// BufferedOutputStream bos = new BufferedOutputStream(os);
		// ObjectOutputStream oos = new ObjectOutputStream(bos);
		// oos.writeObject(u);
		// // NotSerializableException序列化：对象保存至文件
		// // 对象要实现Serializable标识接口
		// oos.close();
		//
		// File fs = new File("d:/a/z.txt");
		// InputStream is = new FileInputStream(fs);
		// BufferedInputStream bis = new BufferedInputStream(is);
		// ObjectInputStream ois = new ObjectInputStream(bis);
		// User ut = (User) ois.readObject();// 反序列化
		// System.out.println(ut);
		// ois.close();
		// /////////////////////////////////////
		// 字符流
		// File f = new File("d:/a/a.txt");
		// Reader r = new FileReader(f);
		// BufferedReader br = new BufferedReader(r);
		// String line = "";
		// while ((line = br.readLine()) != null) {
		// System.out.println(line);
		// }
		// br.close();
		// /////////////////////////////////////
		// File f = new File("d:/a/a.txt");
		// InputStream is = new FileInputStream(f);// 字节流
		//
		// InputStreamReader isr = new InputStreamReader(is);// 转换流
		//
		// BufferedReader br = new BufferedReader(isr);// 字符流
		//
		// String line = "";
		// while ((line = br.readLine()) != null) {
		// System.out.println(line);
		// }
		// br.close();

		// ////////////////////////////
		// File f = new File("d:/a");
		// File[] fs = f.listFiles(new FilenameFilter() {
		// @Override
		// public boolean accept(File dir, String name) {
		// return name.endsWith(".txt");
		// }
		// });
		// for (File ft : fs) {
		// System.out.println(ft.getName());
		// }

	}

}
