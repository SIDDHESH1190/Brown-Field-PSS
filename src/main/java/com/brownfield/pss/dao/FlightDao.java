package com.brownfield.pss.dao;

import java.util.List;
import org.springframework.stereotype.Service;
import com.brownfield.pss.model.Flight;
import com.brownfield.pss.repository.IFlightRepository;
import com.brownfield.pss.service.IFlightService;

@Service
public class FlightDao implements IFlightService {

	IFlightRepository flightRepos;

	@Override
	public Flight addFlight(Flight flight) {
		return flightRepos.save(flight);
	}

	@Override
	public Flight getFlight(int flightId) {

		return flightRepos.findById(flightId).get();
	}

	@Override
	public List<Flight> getAllFlight() {
		return flightRepos.findAll();
	}

	@Override
	public String deleteFlight(int flightId) {
		flightRepos.deleteById(flightId);
		return "deleted";
	}

}
