package com.yc.img;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * 生成随机验证码
 * 
 * @author Administrator
 * 
 */
public class MyImg {
	private String valueCode = "";
	private int width = 120, height = 20;
	private int codeLength = 6;
	private boolean flg = true;

	public MyImg() {
		valueCode = randString();
	}

	/**
	 * 
	 * @return 图和图中的文字
	 */
	public Object[] getImageAndValueCode() {
		String valueCode = randString();
		Object[] rs = { getImage(valueCode), valueCode };
		return rs;
	}

	/**
	 * 获取生成的验证码图形
	 * 
	 * @return BufferedImage
	 */
	public BufferedImage getImage() {
		return getImage(valueCode);
	}

	public BufferedImage getImage(String vc) {
		Random r = new Random();
		BufferedImage img = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = img.getGraphics();
		g.fillRect(0, 0, width, height);
		g.setFont(new Font("Time New Roman", Font.ITALIC, 18));
		for (int i = 0; i < 200; i++) {
			g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			int x, y;
			x = r.nextInt(120);
			y = r.nextInt(20);
			g.drawOval(x, y, 1, 1);
		}
		for (int i = 0; i < codeLength; i++) {
			g.setColor(new Color(20 + r.nextInt(180), 20 + r.nextInt(180),
					20 + r.nextInt(180)));
			g.drawString(vc.substring(i, i + 1), i * 20 + 6, 16);
		}
		g.dispose();
		return img;
	}

	/**
	 * 获取生成的验证码字符
	 * 
	 * @return
	 */
	public String getValueCode() {
		return valueCode;
	}

	/**
	 * 生成一组随机字符
	 * 
	 * @return
	 */
	public String randString() {
		String rc = "";
		for (int i = 0; i < codeLength; i++) {
			rc += randChar();
		}
		return rc;
	}

	/**
	 * 生成一个随机字符
	 * 
	 * @return
	 */
	public char randChar() {
		int t = (int) (Math.random() * 62);
		char c;
		if (t < 10) {
			c = (char) (t + '0');
		} else if (t < 36) {
			c = (char) (t - 10 + 'A');
		} else {
			c = (char) (t - 36 + 'a');
		}
		return c;
	}

}
