package com.packt.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
  
@Controller
public class HomeController {


	@RequestMapping(value={"/", "/welcome"}, method = RequestMethod.GET)
	public String helloWorld(Model model){
		//model.addAttribute("featureProducts", productService.getFeatureProduct());
		//model.addAttribute("newProducts", productService.findAllByOrderByCreatedDateDesc());
		return "welcome";
	}
	
	@RequestMapping(value={"/welcome2"}, method = RequestMethod.GET)
	public String helloWorld2(Model model){
		//model.addAttribute("featureProducts", productService.getFeatureProduct());
		//model.addAttribute("newProducts", productService.findAllByOrderByCreatedDateDesc());
		return "welcome2";
	}	
 
}
