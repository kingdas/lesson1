package com.yc.io;

import java.io.Serializable;

public class User implements Serializable {// 标识接口

	private transient int age;// 瞬时
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}

	public User(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
