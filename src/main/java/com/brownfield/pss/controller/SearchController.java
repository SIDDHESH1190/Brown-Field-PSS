package com.brownfield.pss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brownfield.pss.dao.SearchDao;
import com.brownfield.pss.model.Flight;
import com.brownfield.pss.model.Search;

@RestController
@RequestMapping
public class SearchController {

	@Autowired
	SearchDao searchDao;

	@GetMapping("/searchFlights")
	public List<Flight> searchFlights(@RequestBody Search search) {
		return searchDao.searchFlights(search);

	}

}
