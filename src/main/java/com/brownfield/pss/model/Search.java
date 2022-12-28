package com.brownfield.pss.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Search {

	private String fromCity;
	private String toCity;
	private LocalDate dateOfDeparture;
	private LocalTime timeOfDeparture;
	private int noOfPassengers;

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public LocalDate getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(LocalDate dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public LocalTime getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(LocalTime timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

}
