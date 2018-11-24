package com.yc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0) {//当监听到服务器启动时
		System.out.println("服务器启动，服务中的应用程序也就启动了");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("服务器停止，服务中的应用程序也就停止了");
		System.out.println("..");
	}

}
