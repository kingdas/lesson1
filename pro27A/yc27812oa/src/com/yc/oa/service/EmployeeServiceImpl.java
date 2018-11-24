package com.yc.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.framework.BaseDao;
import com.yc.framework.BaseServiceImpl;
import com.yc.oa.dao.EmployeeDao;
import com.yc.oa.model.Employee;

@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements
		EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public BaseDao<Employee> getDao() {
		return employeeDao;
	}

	@Override
	public Employee login(Employee emp) {
		List<Employee> emps = employeeDao.findByCondition(emp);
		if (emps != null && emps.size() > 0) {
			return emps.get(0);
		}
		return null;
	}

}
