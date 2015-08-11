package com.packt.project.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.project.domain.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long>{

}
