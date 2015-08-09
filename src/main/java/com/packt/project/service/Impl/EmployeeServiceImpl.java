package com.packt.project.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.project.domain.Employee;
import com.packt.project.repository.EmployeeRepository;
import com.packt.project.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepository.findAll();
	}

	public Employee getEmployeeByNumber( int employeeId) {
	
		return (Employee) employeeRepository.getEmployeeByNumber(employeeId);
	}

	public void save(Employee employeeToBeAdded) {
		employeeRepository.save(employeeToBeAdded);
		
	}

}
