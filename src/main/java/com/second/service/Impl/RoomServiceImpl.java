package com.second.service.Impl;

import com.second.dto.RoomDto;
import com.second.dto.RoomFacilityDto;
import com.second.entity.HotelEntity;
import com.second.entity.RoomEntity;
import com.second.entity.RoomFacilityEntity;
import com.second.repositery.HotelRepositery;
import com.second.repositery.RoomFacilityRepositery;
import com.second.repositery.RoomRepositery;
import com.second.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepositery roomRepositery;

    @Autowired
    HotelRepositery hotelRepositery;

    @Autowired
    RoomFacilityRepositery roomFacilityRepositery;

    @Override
    public int saveroom(RoomDto roomDto, int hotelid) {

        RoomEntity roomEntity= new RoomEntity(roomDto.getRtype(),roomDto.getSleppers(),roomDto.getPrice(),roomDto.getFacts(),roomDto.getRoom_amount());
        try {
            HotelEntity hotelEntity = this.hotelRepositery.findById(hotelid).get();
            if (hotelEntity != null) {
                roomEntity.setHotelEntity(hotelEntity);
                RoomEntity roomEntity1 = roomRepositery.save(roomEntity);
                return roomEntity1.getRoomid();
            }

        }catch (Exception e){
            return 0;
        }
        return 0;

    }

    @Override
    public boolean saveRoomFacility(RoomFacilityDto roomFacilityDto, int roomid) {
        RoomFacilityEntity roomFacilityEntity=new RoomFacilityEntity(roomFacilityDto.getCity_view(),roomFacilityDto.getFree_wifi(),roomFacilityDto.getAir_conditioning(),roomFacilityDto.getBathroom(),roomFacilityDto.getTv(),roomFacilityDto.getSatalite_channel(),roomFacilityDto.getIron(),roomFacilityDto.getShowers(),roomFacilityDto.getTelephone(),roomFacilityDto.getDryer(),roomFacilityDto.getSlipers());
        try {
            RoomEntity roomEntity=this.roomRepositery.findById(roomid).get();
            if(roomEntity!=null){
                roomEntity.setRoomFacilityEntity(roomFacilityEntity);
                this.roomRepositery.save(roomEntity);
                return true;
            }

        }catch (Exception e){
            return false;
        }
        return false;
    }
}
