package com.yc.oa.service;

import java.util.List;

import com.yc.framework.BaseService;
import com.yc.oa.model.Loan;

public interface LoanService extends BaseService<Loan> {

	List<Loan> findByEmployeeId(Loan l);

}
