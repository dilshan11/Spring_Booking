package com.second.service.Impl;

import com.second.dto.CustomerDto;
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
    public void saveUsername(CustomerEntity customerEntity) {
        //CustomerDto customerDto=new CustomerDto()
    }
}
