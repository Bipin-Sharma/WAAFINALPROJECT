package com.packt.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.project.domain.Employee;
import com.packt.project.service.EmployeeService;

@Controller
@RequestMapping({"/employees" })
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value= {"/","/list"})
	public String listEmployees(Model model) {

		model.addAttribute("employees", employeeService.getAllEmployee());
		return "employees";
	}

	@RequestMapping("/employee")
	public String getEmployeeByNumber(Model model, @RequestParam("id") int employeeId) {
		System.out.println();
		Employee employee = employeeService.getEmployeeByNumber(employeeId);
		model.addAttribute("employee", employee);
		return "employee";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addNewEmployee(@ModelAttribute("newEmployee") Employee newEmployee) {
		return "addEmployee";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewEmployee(@ModelAttribute("newEmployee") Employee employeeToBeAdded) {
		
		employeeService.save(employeeToBeAdded);
		return "redirect:/employees/list";
	}

}
