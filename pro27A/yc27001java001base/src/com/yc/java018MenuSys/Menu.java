package com.yc.java018MenuSys;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<Food> menuList;
	

	public List<Food> getMenuList() {
		return menuList;
	}

	public Menu() {
		menuList = new ArrayList<Food>();
		menuList.add(new Food(1, "œ∑º“–°≥¥»‚", 28));
		menuList.add(new Food(2, "∫⁄Ω∑≈£≈≈", 32));
		menuList.add(new Food(3, " ≤ ﬂ…’∂π∏Ø", 20));
		menuList.add(new Food(4, "º¶Î”≥¥∫…¿º∂π", 25));
		menuList.add(new Food(5, "∞Â¿ıÏ–Õ¡º¶", 45));
	}

	@Override
	public String toString() {
		String info = "";
		for (Food f : menuList) {
			info += f.getId() + "\t";
			info += f.getName() + "\t";
			info += f.getPrice() + "\n";
		}
		return info;
	}

}
