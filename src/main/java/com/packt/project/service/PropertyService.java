package com.packt.project.service;

import java.util.List;

import com.packt.project.domain.Property;

public interface PropertyService {

	public void saveApartment(Property property);

	public List<Property> getAllProperty();

	public void delete(Long id);

	public Property findOne(Long id);

}
