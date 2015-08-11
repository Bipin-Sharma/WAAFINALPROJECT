package com.packt.project.service.Impl;

import java.util.List;

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

	@Override
	public List<Property> getAllProperty() {
		return (List<Property>) propertyRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		
		propertyRepository.delete(id);
		
	}

	@Override
	public Property findOne(Long id) {
		
		return propertyRepository.findOne(id);
	}

}
