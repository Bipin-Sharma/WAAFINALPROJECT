package com.packt.project.domain;

import javax.persistence.Entity;

@Entity
public class Broker extends Person {

	private String registrationNumber;

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
}
