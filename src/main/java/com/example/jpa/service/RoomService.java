package com.example.jpa.service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.jpa.model.Room;

import com.example.jpa.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    
    @Autowired
    RoomRepository repo;

    public Room saveRoom(Room entity) {
        return repo.saveRoom(entity);

    }    

    public ArrayList<Room> findByIsAvaliable(boolean avaliability) {
        return repo.findByIsAvaliable(avaliability);
    }

    public Optional<Room> findByRoomNumber(Long id) {
        return repo.findByRoomNumber(id);
    }

    public void deleteByRoomNumber(Long id) {
        repo.deleteByRoomNumber(id);
    }


}
