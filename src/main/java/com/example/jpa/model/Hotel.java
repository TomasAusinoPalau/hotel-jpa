package com.example.jpa.model;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> rooms;
    private ArrayList<User> users;
    private ArrayList<Reservation> reservations;

    Hotel () {  
        rooms = new ArrayList();
        users = new ArrayList();
    }

    // public boolean reservateRoom(User user, Date checkIn, Date checkOut) {
    //     for(Room room : rooms) {
    //         if(room.isAvaliable()) {
    //             Reservation reservation = new Reservation(room.getRoomNumber(), user, checkIn, checkOut);
    //             user.setReservation(reservation);
    //             reservations.add(reservation);
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    // public boolean isReservated(Room room, Date checkIn, Date checkOut) {
    //     for(Reservation reservation : reservations) {
    //         //add checker de checkIn & checkOut
    //         if(reservation.getRoomNumber() == room.getRoomNumber() && !room.isAvaliable()) {
    //             return false; 
    //         }
    //         return true;
    //     } 
    //     return true;
    // }
}
