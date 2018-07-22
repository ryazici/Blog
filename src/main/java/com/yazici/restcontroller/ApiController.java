package com.yazici.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yazici.entity.Room;
import com.yazici.service.RoomService;

@RestController
@RequestMapping("/api")
public class ApiController {

	private RoomService roomService;
	
	public ApiController(RoomService roomService) {
		this.roomService=roomService;
	}
	
	
	@GetMapping("/rooms")
	public List<Room> rooms(){	
		return roomService.findRooms();
	}
}
