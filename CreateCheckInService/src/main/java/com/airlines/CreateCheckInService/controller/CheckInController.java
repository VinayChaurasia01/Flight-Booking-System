package com.airlines.CreateCheckInService.controller;


import com.airlines.CreateCheckInService.model.CheckIn;
import com.airlines.CreateCheckInService.service.CheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkin")
public class CheckInController {
    @Autowired
    private CheckInService checkInService;

    @PostMapping
    public CheckIn checkIn(@RequestBody CheckIn checkIn) {
        return checkInService.checkIn(checkIn);
    }
}
