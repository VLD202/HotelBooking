
package com.Vijaylaxmi.hotelbooking.controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import com.Vijaylaxmi.hotelbooking.Room;
import com.Vijaylaxmi.hotelbooking.RoomService;
import com.Vijaylaxmi.hotelbooking.RoomService;
import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello! Welcome to Hotel Booking System.";
    }
    
@GetMapping("/rooms/{id}")
public Optional<Room> getRoomById(@PathVariable int id) {
    return roomService.getAllRooms().stream()
            .filter(room -> room.getId() == id)
            .findFirst();
}

@GetMapping("/rooms/info")
public Map<String, Object> getRoomInfo() {
    Map<String, Object> room = new HashMap<>();
    room.put("id", 1);
    room.put("type", "Deluxe");
    room.put("price", 2500);
    room.put("available", true);

    return room;
}

@GetMapping("/rooms/demo")
public Room getDemoRoom() {
    return new Room(1, "Deluxe", 2500, true);
}

@GetMapping("/rooms/1")
public Room get1Room(){
    return new Room(id : 1 , type:"small",price:800,available:true);
}
@GetMapping("/rooms/2"){
    public Room get2Room(){
        return new Room(id : 2 , type:"medium",price:1200,available:true);
    }
}

private final RoomService roomService;

public HelloController(RoomService roomService) {
    this.roomService = roomService;
}



@PostMapping("/rooms")
public Room createRoom() {
    return roomService.createRoom();
}
@GetMapping("/rooms")
public List<Room> getAllRooms() {
    return roomService.getAllRooms();
}

}
