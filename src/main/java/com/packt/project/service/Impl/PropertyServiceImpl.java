package com.packt.project.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.project.domain.Property;
import com.packt.project.repository.PropertyRepository;
import com.packt.project.service.PropertyService;

@Service
@Transactional
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	PropertyRepository  propertyRepository;
	
	@Override
	public void saveApartment(Property property) {
		propertyRepository.save(property);
		
	}

}
