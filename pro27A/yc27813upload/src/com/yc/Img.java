package com.yc;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

import javax.imageio.ImageIO;

public class Img {

	public static BufferedImage getImg(String code) {
		int width = 140, height = 36;
		BufferedImage bi = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = bi.getGraphics();
		g.setColor(new Color(255, 0, 0));
		g.drawLine(0, 0, 36, 36);
		g.drawOval(0, 0, 140, 36);
		g.drawString("ABC", 20, 18);
		g.dispose();
		return bi;
	}

	public static void main(String[] args) {
		try {
			ImageIO.write(Img.getImg("xxx"), "PNG", new FileOutputStream(
					new File("d:xxxxx.png")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
