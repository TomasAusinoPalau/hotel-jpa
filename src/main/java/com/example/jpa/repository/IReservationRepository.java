package com.example.jpa.repository;

import com.example.jpa.model.Reservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * IReservationRepository
 */
@Repository
public interface IReservationRepository extends CrudRepository<Reservation, Long>  {

    public Iterable<Reservation> findAllByDni(Long userDNI);

    public Iterable<Reservation> findAllByRoomNumber(Long roomNumber);
    
}