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

	int tc = 10000;// �ܷ�����
	int oc = 0;// ��������

	public void contextInitialized(ServletContextEvent sce) {
		// tc = 10000;//��ȡ
		sc = sce.getServletContext();
		sc.setAttribute("tc", tc);
		sc.setAttribute("oc", oc);
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// tcд��
	}

	public void sessionCreated(HttpSessionEvent arg0) {// �µĻỰ
		/*
		 * ++tc; ++oc;
		 */
		sc.setAttribute("tc", ++tc);
		sc.setAttribute("oc", ++oc);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {// �Ự����
		// --oc;
		sc.setAttribute("oc", --oc);
	}

}
