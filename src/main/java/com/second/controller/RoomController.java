package com.second.controller;

import com.second.dto.RoomDto;
import com.second.dto.RoomFacilityDto;
import com.second.entity.RoomEntity;
import com.second.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("rooms")
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("saveroom")
    public int saveroom(@RequestBody RoomDto roomDto, @RequestParam int hotelid){
        return this.roomService.saveroom(roomDto,hotelid);

    }

    @PostMapping("facility")
    public boolean saveRoomFacility(@RequestBody RoomFacilityDto roomFacilityDto,@RequestParam int roomid){
       return this.roomService.saveRoomFacility(roomFacilityDto,roomid);

    }
}
