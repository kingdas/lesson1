package com.yc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent arg0) {//������������������ʱ
		System.out.println("�����������������е�Ӧ�ó���Ҳ��������");
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("������ֹͣ�������е�Ӧ�ó���Ҳ��ֹͣ��");
		System.out.println("..");
	}

}
