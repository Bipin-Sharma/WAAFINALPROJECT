package com.packt.project.service;

import java.util.List;

import com.packt.project.domain.Employee;

public interface EmployeeService{

public List<Employee> getAllEmployee();

public Employee getEmployeeByNumber(int employeeId);

public void save(Employee employeeToBeAdded);

}
