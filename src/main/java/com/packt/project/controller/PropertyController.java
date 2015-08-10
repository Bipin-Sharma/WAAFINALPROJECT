package com.packt.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.project.domain.Property;
import com.packt.project.service.PropertyService;

@Controller
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;
	
	@RequestMapping(value = { "/", "/addapartment" })
	public String addApartment(@ModelAttribute("apartment") Property property) {
		System.out.println("Category add");
		return "apartment";
	}

	@RequestMapping(value = { "/saveapartment" })
	public String saveApartment(@ModelAttribute("apartment") Property property) {

		propertyService.saveApartment(property);
		return "redirect:/addapartment";
	}
}
