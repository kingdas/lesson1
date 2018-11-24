package com.yc.oa.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yc.oa.model.Employee;
import com.yc.oa.model.Loan;
import com.yc.oa.service.LoanService;

@Controller
@RequestMapping("loan")
public class LoanController {
	@Autowired
	private LoanService loanService;

	@RequestMapping("list")
	public String list(HttpSession sess, Model m) {
		Employee emp = (Employee) sess.getAttribute("emp");
		Loan l = new Loan();
		l.setEmployeeId(emp.getId());
		List<Loan> ls = loanService.findByEmployeeId(l);
		System.out.println(l);
		System.out.println(ls);
		m.addAttribute("ls", ls);
		return "list";
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(Loan l, HttpSession sess) {
		Employee emp = (Employee) sess.getAttribute("emp");
		l.setApplyDate(new Date());
		l.setEmployeeId(emp.getId());
		l.setStatus(0);
		loanService.add(l);
		return "redirect:/loan/list";
	}

}
