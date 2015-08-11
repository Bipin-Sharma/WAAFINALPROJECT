package com.packt.project.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.project.domain.Appointment;
import com.packt.project.service.AppointmentService;
import com.packt.project.service.repository.AppointmentRepository;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService{

	@Autowired
	AppointmentRepository appointmentRepository;

	@Override
	public void saveAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
	}
	
	

	
}
