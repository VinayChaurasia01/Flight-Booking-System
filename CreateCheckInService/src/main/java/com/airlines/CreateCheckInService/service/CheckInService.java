package com.airlines.CreateCheckInService.service;


import com.airlines.CreateCheckInService.model.CheckIn;
import com.airlines.CreateCheckInService.repo.CheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckInService {
    @Autowired
    private CheckInRepository checkInRepository;

    public CheckIn checkIn(CheckIn checkIn) {
        return checkInRepository.save(checkIn);
    }
}
