package com.brownfield.pss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brownfield.pss.dao.BookingDao;
import com.brownfield.pss.model.Booking;

@RestController
@RequestMapping("/")
public class BookingController {

	@Autowired
	BookingDao bookingDao;

	@PostMapping("/createBooking")
	public Booking createBooking(@RequestBody Booking booking) {
		return bookingDao.createBooking(booking);
	}

}
