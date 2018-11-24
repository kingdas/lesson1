package com.yc;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileUpload extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		if (ServletFileUpload.isMultipartContent(request)) {// 文件上传
			List<FileItem> fis = null;
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			try {
				fis = sfu.parseRequest(request);// 请求转成集合
				for (FileItem fi : fis) {
					if (!fi.isFormField()) {// 文件
						String p1 = request.getRealPath("/") + "/res/upload/";
						String p2 = new SimpleDateFormat("yyyy/MM/dd/")
								.format(new Date());
						String p3 = UUID.randomUUID().toString();
						String p4 = fi.getName().substring(
								fi.getName().lastIndexOf('.'));
						File fd = new File(p1 + p2 + p3 + p4);
						if (!fd.getParentFile().exists()) {
							fd.getParentFile().mkdirs();
						}
						fi.write(fd);// 保存文件
						String sp = p2 + p3 + p4;
						System.out.println(sp);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
