package com.packt.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.project.domain.Customer;
import com.packt.project.service.CustomerService;

@Controller
@RequestMapping("/register")
public class CustomerController {

//	@Autowired
//	CustomerService customerService;
	
	
	@RequestMapping(value ={"/"})
	public String addcustomer (@ModelAttribute("customer") Customer customer){
		
		
		return "customerregistration";
		
		
	}
	
	
}
