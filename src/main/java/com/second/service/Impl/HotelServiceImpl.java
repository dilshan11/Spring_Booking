package com.second.service.Impl;

import com.second.dto.FacilityDto;
import com.second.dto.HotelDto;
import com.second.entity.FacilityEntity;
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
        HotelEntity hotelEntity = new HotelEntity(hotelDto.getPtype(), hotelDto.getPname(), hotelDto.getSadress(), hotelDto.getVillage(), hotelDto.getCity(),hotelDto.getImageinput());
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

    @Override
    public boolean saveFacilityForm(FacilityDto facilityDto, int hotelid) {
        FacilityEntity facilityEntity1=new FacilityEntity(facilityDto.getOutdoor_pool(),facilityDto.getDryer(),facilityDto.getIndoor_pool(),facilityDto.getHot_tub(),facilityDto.getFree_parking(),facilityDto.getGym(),facilityDto.getHeating(),facilityDto.getCloset(),facilityDto.getFireplace(),facilityDto.getEntrance(),facilityDto.getElevator(),facilityDto.getWheelchair(),facilityDto.getDoorman(),facilityDto.getBreakfast(),facilityDto.getTea(),facilityDto.getCoffee(),facilityDto.getTeamaker(),facilityDto.getKitchen());
        try {
            HotelEntity hotelEntity = hotelRepositery.findById(hotelid).get();
            hotelEntity.setFacilityEntity(facilityEntity1);
            hotelRepositery.save(hotelEntity);

            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public List<HotelDto> getallhotel_owner(String id) {
        try {
            List<HotelEntity> hotelEntityList = this.hotelRepositery.findByownerId(Integer.parseInt((id)));
            if (hotelEntityList == null) {
                return null;
            }
            List<HotelDto> hotelDtos = new ArrayList<>();
            for (HotelEntity hotelEntity : hotelEntityList) {
                HotelDto hotelDto = new HotelDto(hotelEntity.getHotelid(), hotelEntity.getPtype(), hotelEntity.getPname(), hotelEntity.getSadress(), hotelEntity.getVillage(), hotelEntity.getCity(), hotelEntity.getHotelid(), hotelEntity.getImageinput());
                hotelDtos.add(hotelDto);
            }
            return hotelDtos;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }

    }
}

