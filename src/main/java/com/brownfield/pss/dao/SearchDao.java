package com.brownfield.pss.dao;

import java.util.List;
import org.springframework.stereotype.Service;
import com.brownfield.pss.model.Flight;
import com.brownfield.pss.model.Search;
import com.brownfield.pss.repository.IFlightRepository;
import com.brownfield.pss.service.ISearchService;

@Service
public class SearchDao implements ISearchService {

	IFlightRepository flightRepos;

	@Override
	public List<Flight> searchFlights(Search search) {
		// TODO Auto-generated method stub
		return flightRepos.getFlightBySearch(search.getFromCity(), search.getToCity(), search.getDateOfDeparture(), search.getNoOfPassengers());
	}

}
