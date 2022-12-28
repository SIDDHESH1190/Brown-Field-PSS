package com.brownfield.pss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.brownfield.pss.model.Booking;

@Repository
public interface IBookingRepository extends JpaRepository<Booking, Integer> {

}
