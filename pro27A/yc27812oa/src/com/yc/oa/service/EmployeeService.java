package com.yc.oa.service;

import com.yc.framework.BaseService;
import com.yc.oa.model.Employee;

public interface EmployeeService extends BaseService<Employee> {
	
	Employee login(Employee emp);
	

}
