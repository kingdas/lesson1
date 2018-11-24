package com.yc.img;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		MyImg img = new MyImg();

		FileOutputStream fos;
		Object[] rs;
		// fos= new FileOutputStream("c:/xx0.jpg");
		// ImageIO.write(img.getImage(), "JPEG", fos);
		// System.out.println(img.getValueCode());
		//
		//
		// fos = new FileOutputStream("c:/xx1.jpg");
		// ImageIO.write(img.getImage(), "JPEG", fos);
		// System.out.println(img.getValueCode());
		//
		// fos = new FileOutputStream("c:/xx2.jpg");
		// rs=img.getImageAndValueCode();
		// ImageIO.write((BufferedImage)(rs[0]), "JPEG", fos);
		// System.out.println(rs[1]);

		fos = new FileOutputStream("d:/xx3.jpg");
		rs = img.getImageAndValueCode();
		ImageIO.write((BufferedImage) (rs[0]), "JPEG", fos);
		System.out.println(rs[1]);

		fos.close();

		System.out.println("ok");
	}

}
