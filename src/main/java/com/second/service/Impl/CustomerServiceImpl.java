package com.second.service.Impl;

import com.second.dto.CustomerDto;
import com.second.dto.LoginDto;
import com.second.entity.CustomerEntity;
import com.second.repositery.CustomerRepositery;
import com.second.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepositery customerRepositery;


    @Override
    public String saveRegisterDetails(CustomerDto customerDto) {
        CustomerEntity customerEntity=new CustomerEntity(customerDto.getFname(),customerDto.getLname(),customerDto.getEmail(),customerDto.getPassword(),customerDto.getPhnumber());
        try {
            if(customerRepositery.findByEmail(customerEntity.getEmail()).size()==0) {
                customerRepositery.save(customerEntity);
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
    public CustomerEntity checklogin(LoginDto loginDto) {
        try {
            CustomerEntity customerEntity=customerRepositery.findByEmail(loginDto.getEmail()).get(0);
            if(customerEntity.getPassword().equals(loginDto.getPassword())){
                return customerEntity;
            }
        }catch (Exception ex){
            return null;
        }
        return null;
    }
}
