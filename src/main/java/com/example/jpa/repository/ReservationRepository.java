package com.example.jpa.repository;

import com.example.jpa.model.Reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationRepository {
    @Autowired
    private IReservationRepository repo;

    public Reservation saveReservation(Reservation reservation) {
        return repo.save(reservation);
    }

    public boolean deleteReservation(Long idReservation) {
        try {
            repo.deleteById(idReservation);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Iterable<Reservation> findAllReservations() {
        return repo.findAll();
    }

    public Iterable<Reservation> findAllByDni(Long userDNI) {
        return repo.findAllByDni(userDNI);
    }

    public Iterable<Reservation> findAllByRoom(Long roomNumber) {
        return repo.findAllByRoomNumber(roomNumber);
    }

    // public Reservation updateReservation(Reservation reservation) {
    //     return repo.
    // }
}
