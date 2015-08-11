package com.packt.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.project.domain.Property;
import com.packt.project.service.PropertyService;

@Controller
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	PropertyService propertyService;

	@RequestMapping(value = { "/"})
	public String addApartment(@ModelAttribute("apartment") Property property, Model model) {
		System.out.println("Category add");
		model.addAttribute("propertyList", propertyService.getAllProperty());
		return "listapartment";
	}

	@RequestMapping(value = { "/add" })
	public String saveApartment(@ModelAttribute("apartment") Property property) {

		propertyService.saveApartment(property);
		return "apartment";
	}

	
	@RequestMapping(value = { "/saveproperty" }, method = RequestMethod.POST)
	public String saveApartment1(@ModelAttribute("apartment") Property property) {

		propertyService.saveApartment(property);
		return "redirect:/property/";
	}

	
	@RequestMapping(value = { "/edit/{id}" })
	public String editApartment(@PathVariable Long id, Model model) {

		model.addAttribute("apartment", propertyService.findOne(id));
		return "apartment";
	}

	
	@RequestMapping("/delete/{id}")
	public String deleteApartment(@PathVariable Long id, HttpServletRequest request) {
		propertyService.delete(id);
		String referer = request.getHeader("Referer");
		return "redirect:" + referer;
	}
}
