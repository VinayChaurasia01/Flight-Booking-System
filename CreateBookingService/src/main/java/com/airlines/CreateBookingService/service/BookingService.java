package com.airlines.CreateBookingService.service;


import com.airlines.CreateBookingService.model.Booking;
import com.airlines.CreateBookingService.repo.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}
