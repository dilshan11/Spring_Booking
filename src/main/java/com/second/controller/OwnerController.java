package com.second.controller;

import com.second.dto.HotelDto;
import com.second.dto.LoginDto;
import com.second.dto.OwnerDto;
import com.second.entity.OwnerEntity;
import com.second.service.Impl.HotelServiceImpl;
import com.second.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("owner")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @Autowired
    HotelServiceImpl hotelService;

    @PostMapping("login")
    public OwnerEntity checklogin(@RequestBody LoginDto loginDto){
        return ownerService.checklogin(loginDto);
    }

    @PostMapping("registerOwner")
    public String saveRegisterDetails(@RequestBody OwnerDto ownerDto){
        System.out.println(ownerDto);
        return this.ownerService.saveRegisterDetails(ownerDto);
    }
    @PostMapping("basicform")
    public int saveBasicform(@RequestBody HotelDto hotelDto){
        System.out.println(hotelDto);
        return this.hotelService.saveHotelBasicForm(hotelDto);

    }
}
