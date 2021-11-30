package com.example.jpa.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Getter;



@Getter
@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    private Long idReservation;
    
    @ManyToOne
    @JoinColumn(name = "roomNumber", nullable = false)
    private Room roomNumber;

    @ManyToOne
    @JoinColumn(name = "dniUser")
    private User dni;

    private Date checkIn;
    private Date checkOut;

    Reservation (Room roomNumber, User dni, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.dni = dni;
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    protected Reservation() {}

}
