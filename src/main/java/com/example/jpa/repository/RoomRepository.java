package com.example.jpa.repository;

import java.util.ArrayList;
import java.util.Optional;

import com.example.jpa.model.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoomRepository {
    @Autowired
    IRoomRepository repo;

    public Room saveRoom(Room entity) {
        return repo.save(entity);
    }    

    public ArrayList<Room> findByIsAvaliable(boolean avaliability) {
        return repo.findByIsAvaliable(avaliability);
    }

    public Optional<Room> findByRoomNumber(Long id) {
        return repo.findById(id);
    }

    public void deleteByRoomNumber(Long id) {
        repo.deleteById(id);
    }
    
}
