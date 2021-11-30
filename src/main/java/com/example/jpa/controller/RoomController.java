package com.example.jpa.controller;


import java.util.ArrayList;
import java.util.Optional;

import com.example.jpa.model.Room;
import com.example.jpa.service.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    
    @Autowired
    private RoomService service;

    @GetMapping("/")
    public Optional<Room> getByNumber(
        @RequestParam(name = "roomNumber") Long roomNumber) {
            return service.findByRoomNumber(roomNumber);
        }

    @GetMapping("/avaliable")
    public ArrayList<Room> getAvaliableRooms() {
        return service.findByIsAvaliable(true);
    }

    // ¿delete & add?
}