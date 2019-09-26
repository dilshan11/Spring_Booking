package com.second.service;

import com.second.dto.LoginDto;
import com.second.dto.OwnerDto;
import com.second.entity.OwnerEntity;

public interface OwnerService {
    public String saveRegisterDetails(OwnerDto ownerDto);

    public OwnerEntity checklogin(LoginDto loginDto);
}
