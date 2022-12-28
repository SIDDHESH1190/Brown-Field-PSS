package com.brownfield.pss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brownfield.pss.dao.FlightDao;
import com.brownfield.pss.model.Flight;

@RestController
@RequestMapping
public class FlightController {

	@Autowired
	FlightDao flightDao;

	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight) {
		return flightDao.addFlight(flight);
	}

	@GetMapping("/getFlight")
	public Flight getFlight(@RequestParam int flightId) {
		return flightDao.getFlight(flightId);
	}

	@GetMapping("/getAllFlight")
	public List<Flight> getAllFlight() {
		return flightDao.getAllFlight();
	}

	@DeleteMapping("/deleteFlight")
	public String deleteFlight(@RequestParam int flightId) {
		return flightDao.deleteFlight(flightId);

	}

}
