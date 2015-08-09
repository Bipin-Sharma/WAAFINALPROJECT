package com.packt.project.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Apartment extends Property {
	
	private int floorNumber;
	
	@ElementCollection
	private List<String> communityAmenities;
	
	public List<String> getCommunityAmenities() {
		return communityAmenities;
	}

	public void setCommunityAmenities(List<String> communityAmenities) {
		this.communityAmenities = communityAmenities;
	}
	
	public void addAmenity(String amenity){
		communityAmenities.add(amenity);
	}
	
	public void removeAmenity(String amenity){
		communityAmenities.remove(amenity);
	}	

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
 
}
