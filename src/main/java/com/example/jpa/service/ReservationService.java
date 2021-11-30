package com.example.jpa.service;

import com.example.jpa.model.Reservation;
import com.example.jpa.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository repo;

    public Reservation saveReservation(Reservation reservation) {
        return repo.saveReservation(reservation);
    }

    public boolean deleteReservation(Long idReservation) {
        return repo.deleteReservation(idReservation);
    }

    public Iterable<Reservation> findAllReservation() {
        return repo.findAllReservations();
    }

    public Iterable<Reservation> findAllByDni(Long userDNI) {
        return repo.findAllByDni(userDNI);
    }

    public Iterable<Reservation> findAllByRoom(Long roomNumber) {
        return repo.findAllByRoom(roomNumber);
    }

}
