package com.second.service;

import com.second.dto.FacilityDto;
import com.second.dto.HotelDto;
import com.second.entity.FacilityEntity;

import java.util.List;

public interface HotelService {
    public int saveHotelBasicForm(HotelDto hotelDto);

    public boolean saveFacilityForm(FacilityDto facilityDto, int hotelid);
    public List<HotelDto> getallhotel_owner(String id);
}
