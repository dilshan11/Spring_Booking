package com.second.service;

import com.second.dto.CustomerDto;
import com.second.dto.LoginDto;
import com.second.entity.CustomerEntity;

public interface CustomerService {
   public String saveRegisterDetails(CustomerDto customerDto);

   public CustomerEntity checklogin(LoginDto loginDto);
}
