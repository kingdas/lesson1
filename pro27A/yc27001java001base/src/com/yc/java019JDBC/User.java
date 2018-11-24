package com.yc.java019JDBC;

public class User {
	private int id;
	private String name;
	private String tel;
	private int group_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", tel=" + tel
				+ ", group_id=" + group_id + "]";
	}
	public User(int id, String name, String tel, int group_id) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.group_id = group_id;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
