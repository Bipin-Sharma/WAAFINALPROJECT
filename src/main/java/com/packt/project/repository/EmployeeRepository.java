package com.packt.project.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.packt.project.domain.Employee;

	@Repository
	public interface EmployeeRepository extends  CrudRepository<Employee, Integer> 
	{	
		
		@Query("SELECT e FROM Employee e WHERE e.employeeNumber = :employeeId")
		public Employee getEmployeeByNumber(@Param("employeeId") int employeeId);
  	}

