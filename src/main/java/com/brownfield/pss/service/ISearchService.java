package com.brownfield.pss.service;

import java.util.List;

import com.brownfield.pss.model.Flight;
import com.brownfield.pss.model.Search;

public interface ISearchService {

	public List<Flight> searchFlights(Search search);

}
