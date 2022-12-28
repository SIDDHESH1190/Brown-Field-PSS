package com.brownfield.pss.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "passenger_table")
@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	private String firstName;
	private String lastName;
	private Gender gender;
	private Boolean isWheelchairRequired;
	
	@ManyToOne
	private Booking booking;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Boolean getIsWheelchairRequired() {
		return isWheelchairRequired;
	}

	public void setIsWheelchairRequired(Boolean isWheelchairRequired) {
		this.isWheelchairRequired = isWheelchairRequired;
	}

}
