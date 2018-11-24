package com.yc.sort;

public class User{// implements Comparable {
	private int age;
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

//	@Override
//	public int compareTo(Object o) {
//		// User u=(User) o;
//		// return this.age-u.age;
//		User u = (User) o;
//		return this.name.compareTo(u.name);

//	}
}
