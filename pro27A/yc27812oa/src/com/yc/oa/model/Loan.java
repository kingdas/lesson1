package com.yc.oa.model;

import java.util.Date;

public class Loan {
	private Integer id;
	private Integer employeeId;
	private String title;
	private double amount;
	private Date applyDate;
	private Integer status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Loan [id=" + id + ", employeeId=" + employeeId + ", title="
				+ title + ", amount=" + amount + ", applyDate=" + applyDate
				+ ", status=" + status + "]";
	}
	public Loan(Integer id, Integer employeeId, String title, double amount,
			Date applyDate, Integer status) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.title = title;
		this.amount = amount;
		this.applyDate = applyDate;
		this.status = status;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loan(Integer employeeId, String title, double amount,
			Date applyDate, Integer status) {
		super();
		this.employeeId = employeeId;
		this.title = title;
		this.amount = amount;
		this.applyDate = applyDate;
		this.status = status;
	}
	
	
	
	
	
}
