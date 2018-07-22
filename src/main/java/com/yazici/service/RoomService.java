package com.yazici.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yazici.entity.Room;
import com.yazici.repository.RoomRepository;

@Service
public class RoomService {

	private RoomRepository roomRepository;
	
	@Autowired
    public RoomService(RoomRepository roomRepository) {
		this.roomRepository=roomRepository;
	}
	
	
	public List<Room> findRooms() {
		List<Room> rooms=new ArrayList<>();
		roomRepository.findAll().forEach(rooms::add);
		return rooms;
	}
	
	public void add(Room room) {
		roomRepository.save(room);
	}
	
}
