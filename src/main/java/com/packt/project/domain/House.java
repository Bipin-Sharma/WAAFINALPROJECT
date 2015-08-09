package com.packt.project.domain;

import javax.persistence.Entity;

@Entity
public class House extends Property {

	private int numberOfFloors;

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	
	
}
