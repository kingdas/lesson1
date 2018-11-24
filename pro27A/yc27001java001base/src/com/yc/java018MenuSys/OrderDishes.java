package com.yc.java018MenuSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderDishes {
	private List<Food> orderList = new ArrayList<Food>();
	private Menu menu = new Menu();

	public void addOrderList() {
		Scanner s = new Scanner(System.in);
		System.out.println("菜单如下，请选择");
		System.out.println(menu);
		System.out.println("请点菜，输入菜的编号，0代表结束");
		int n = 0;
		Food f;
		do {
			n = s.nextInt();
			for (int i = 0; i < menu.getMenuList().size(); i++) {
				f = menu.getMenuList().get(i);
				if (f.getId() == n) {
					orderList.add(f);
				}
			}
		} while (n != 0);
	}

	public void calcFee() {
		int sum = 0;
		for (Food f : orderList) {
			sum += f.getPrice();
		}
		System.out.println("结账，你总共消费了" + sum + "元");
	}

}
