package com.brownfield.pss.model;

import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "flight_table")
@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	private LocalTime timeOfDeparture;
	private LocalTime timeOfArrival;

	@OneToOne
	private Airport source;

	@OneToOne
	private Airport destination;

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public LocalTime getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(LocalTime timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	public LocalTime getTimeOfArrival() {
		return timeOfArrival;
	}

	public void setTimeOfArrival(LocalTime timeOfArrival) {
		this.timeOfArrival = timeOfArrival;
	}

	public Airport getSource() {
		return source;
	}

	public void setSource(Airport source) {
		this.source = source;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}

}
