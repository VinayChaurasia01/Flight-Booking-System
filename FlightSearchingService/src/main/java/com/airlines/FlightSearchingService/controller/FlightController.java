package com.airlines.FlightSearchingService.controller;


import com.airlines.FlightSearchingService.model.Flight;
import com.airlines.FlightSearchingService.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping("/search")
    public List<Flight> searchFlights(@RequestParam String origin, @RequestParam String destination) {
        return flightService.searchFlights(origin, destination);
    }
}
