package com.packt.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.project.domain.Appointment;
import com.packt.project.service.AppointmentService;

@Controller
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;

	@RequestMapping(value="/addAppointment", method = RequestMethod.GET)
	public String createAppointment(@ModelAttribute("newAppointment") Appointment appointment){
		return "createAppointment";
	}
	
	@RequestMapping(value="/addAppointment", method = RequestMethod.POST)
	public void saveAppointment(@ModelAttribute("newAppointment") Appointment appointment){
		appointmentService.saveAppointment(appointment);
		//TODO: PRG		
	}	
	
	
}
