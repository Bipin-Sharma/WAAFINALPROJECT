package com.packt.project.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Property {
	
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	private int numberOfBedroom;
	
	private int numberOfRoom;
	
	private int yearOfConstruction;
	
	private boolean  availiability;
	
	private Date availableDate;
	
	@OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "addressId")
	private Address address;
	
	@ElementCollection
	protected List<String> amenities;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getAmenities() {
		return amenities;
	}

	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}
	
	public void addAmenity(String amenity){
		amenities.add(amenity);
	}
	
	public void removeAmenity(String amenity){
		amenities.remove(amenity);
	}	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumberOfBedroom() {
		return numberOfBedroom;
	}

	public void setNumberOfBedroom(int numberOfBedroom) {
		this.numberOfBedroom = numberOfBedroom;
	}

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}

	public int getYearOfConstruction() {
		return yearOfConstruction;
	}

	public void setYearOfConstruction(int yearOfConstruction) {
		this.yearOfConstruction = yearOfConstruction;
	}

	public boolean isAvailiability() {
		return availiability;
	}

	public void setAvailiability(boolean availiability) {
		this.availiability = availiability;
	}

	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	
	
	
}
