package com.yc;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener
public class SessionListener implements HttpSessionAttributeListener {

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("session属性" + arg0.getName() + "被删除");

	}

	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("您增加了session属性：" + arg0.getName() + "，值为："
				+ arg0.getValue());
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("session属性" + arg0.getName() + "被修改");
	}

}
