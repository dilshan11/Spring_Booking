package com.second.service.Impl;

import com.second.dto.HotelDto;
import com.second.entity.HotelEntity;
import com.second.entity.OwnerEntity;
import com.second.repositery.HotelRepositery;
import com.second.repositery.OwnerRepositery;
import com.second.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepositery hotelRepositery;

    @Autowired
    OwnerRepositery ownerRepositery;

    @Override
    public int saveHotelBasicForm(HotelDto hotelDto) {
        HotelEntity hotelEntity = new HotelEntity(hotelDto.getPtype(), hotelDto.getPname(), hotelDto.getSadress(), hotelDto.getVillage(), hotelDto.getCity());
        int ownerid = hotelDto.getOwnerId();
        OwnerEntity ownerEntity = ownerRepositery.findById(ownerid).get();
        ownerEntity.add(hotelEntity);
        ownerRepositery.save(ownerEntity);
        List<HotelEntity> hotelEntityList = hotelRepositery.findByownerId(ownerid);

        for (HotelEntity hotelEntity1 : hotelEntityList) {
            if (hotelEntity1.getPname().equals(hotelEntity.getPname())) {

                return hotelEntity1.getHotelid();
            }
        }
            return 1;
    }
}

