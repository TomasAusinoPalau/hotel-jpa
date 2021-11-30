package com.example.jpa.repository;

import java.util.ArrayList;
import java.util.Optional;

import com.example.jpa.model.Room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepository extends CrudRepository<Room, Long> {

    ArrayList<Room> findByIsAvaliable(boolean avaliability);
    
}
