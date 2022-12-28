package com.brownfield.pss.service;

import java.util.List;

import com.brownfield.pss.model.Flight;

public interface IFlightService {

	public Flight addFlight(Flight flight);

	public Flight getFlight(int flightId);

	public List<Flight> getAllFlight();

	public String deleteFlight(int flightId);

}
