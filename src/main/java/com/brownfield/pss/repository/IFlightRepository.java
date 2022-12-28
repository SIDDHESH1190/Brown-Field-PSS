package com.brownfield.pss.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.brownfield.pss.model.Flight;

@Repository
public interface IFlightRepository extends JpaRepository<Flight, Integer> {

	@Query(value = "SELECT * FROM flight_table f WHERE f.from_city=?1 and f.to_city=?2 and f.date_of_departure=?3 and f.available_seats>?4", nativeQuery = true)
	List<Flight> getFlightBySearch(String fromCity, String toCity, LocalDate dateOfDeparture, int noOfPassengers);

}