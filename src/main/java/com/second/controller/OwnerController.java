package com.second.controller;

import com.second.dto.LoginDto;
import com.second.dto.OwnerDto;
import com.second.entity.OwnerEntity;
import com.second.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("owner")
public class OwnerController {
    @Autowired
    OwnerService ownerService;

    @PostMapping("login")
    public OwnerEntity checklogin(@RequestBody LoginDto loginDto){
        return ownerService.checklogin(loginDto);
    }

    @PostMapping("registerOwner")
    public String saveRegisterDetails(@RequestBody OwnerDto ownerDto){
        System.out.println(ownerDto);
        return this.ownerService.saveRegisterDetails(ownerDto);
    }
}
