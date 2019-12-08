package com.second.service;

import com.second.dto.RoomDto;
import com.second.dto.RoomFacilityDto;

import java.util.List;

public interface RoomService {

    public int saveroom(RoomDto roomDto,int hotelid);

    public boolean saveRoomFacility(RoomFacilityDto roomFacilityDto,int roomid);

    public List<RoomDto> getrooms_relatedtohotel(int hotelid);
}
