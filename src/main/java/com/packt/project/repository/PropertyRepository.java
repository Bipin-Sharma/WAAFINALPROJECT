package com.packt.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.project.domain.Property;

public interface PropertyRepository extends CrudRepository<Property, Long> {
	
	

}
