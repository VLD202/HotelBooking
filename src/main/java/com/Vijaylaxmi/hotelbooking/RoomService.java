
package com.Vijaylaxmi.hotelbooking;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room createRoom() {
        Room room = new Room(1, "Deluxe", 2500, true);
        return roomRepository.save(room);
    }
    
    public List<Room> getAllRooms() {
    return roomRepository.findAll();
}
}
