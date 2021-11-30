package com.example.jpa.controller;

import java.util.List;

import com.example.jpa.model.Reservation;
import com.example.jpa.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    ReservationService service;

    @GetMapping("/")
    public Iterable<Reservation> getAllReservations() {
        return service.findAllReservation();
    }

}
