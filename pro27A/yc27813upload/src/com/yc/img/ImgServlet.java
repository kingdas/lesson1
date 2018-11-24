package com.yc.img;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImgServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		MyImg mi = new MyImg();
		Object[] os = mi.getImageAndValueCode();
		ImageIO.write((BufferedImage)os[0], "jpeg", response.getOutputStream());
		System.out.println(os[1]);
		request.getSession().setAttribute("code", os[1]);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
