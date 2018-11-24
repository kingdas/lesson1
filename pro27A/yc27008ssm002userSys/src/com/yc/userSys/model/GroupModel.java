package com.yc.userSys.model;

public class GroupModel {
	private Integer id;
	private String name;
	private String remark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "GroupModel [id=" + id + ", name=" + name + ", remark=" + remark
				+ "]";
	}

	public GroupModel(Integer id, String name, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
	}

	public GroupModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupModel(String name, String remark) {
		super();
		this.name = name;
		this.remark = remark;
	}

}
