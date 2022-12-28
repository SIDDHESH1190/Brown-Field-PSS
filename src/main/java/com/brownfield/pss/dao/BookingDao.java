package com.brownfield.pss.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brownfield.pss.model.Booking;
import com.brownfield.pss.repository.IBookingRepository;
import com.brownfield.pss.service.IBookingService;

@Service
public class BookingDao implements IBookingService {

	@Autowired
	IBookingRepository bookingRepos;

	@Override
	public Booking createBooking(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepos.save(booking);
	}

}
