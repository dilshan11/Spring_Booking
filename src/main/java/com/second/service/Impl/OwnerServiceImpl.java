package com.second.service.Impl;

import com.second.dto.LoginDto;
import com.second.dto.OwnerDto;
import com.second.entity.OwnerEntity;
import com.second.repositery.OwnerRepositery;
import com.second.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerRepositery ownerRepositery;

    @Override
    public String saveRegisterDetails(OwnerDto ownerDto) {
        OwnerEntity ownerEntity=new OwnerEntity(ownerDto.getFname(),ownerDto.getLname(),ownerDto.getEmail(),ownerDto.getPassword(),ownerDto.getPhnumber());
        try {
             if(ownerRepositery.findByEmail(ownerEntity.getEmail()).size()==0) {
                 System.out.println(ownerRepositery.findByEmail(ownerEntity.getEmail()).size());
                ownerRepositery.save(ownerEntity);
                return "success";
            }
            else {
                return "this email is used";
            }
        }catch (Exception e){
            return "failed try again";
        }
    }

    @Override
    public OwnerEntity checklogin(LoginDto loginDto) {
        try {
            OwnerEntity ownerEntity= ownerRepositery.findByEmail(loginDto.getEmail()).get(0);
            if(ownerEntity.getPassword().equals(loginDto.getPassword())){
                return ownerEntity;
            }
        }catch (Exception ex){
            return null;
        }
        return null;
    }
}
