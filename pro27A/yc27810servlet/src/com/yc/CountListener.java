package com.yc;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class CountListener implements ServletContextListener,
		HttpSessionListener {
	ServletContext sc;

	int tc = 10000;// 总访问量
	int oc = 0;// 在线人数

	public void contextInitialized(ServletContextEvent sce) {
		// tc = 10000;//读取
		sc = sce.getServletContext();
		sc.setAttribute("tc", tc);
		sc.setAttribute("oc", oc);
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// tc写回
	}

	public void sessionCreated(HttpSessionEvent arg0) {// 新的会话
		/*
		 * ++tc; ++oc;
		 */
		sc.setAttribute("tc", ++tc);
		sc.setAttribute("oc", ++oc);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {// 会话结束
		// --oc;
		sc.setAttribute("oc", --oc);
	}

}
