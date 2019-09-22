package com.second.controller;

import com.second.entity.CustomerEntity;
import com.second.repositery.CustomerRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CustomerController {

    @Autowired
    CustomerRepositery customerRepositery;

    @GetMapping("cu")
    public String saveCustomer(){
        System.out.println("get mapping wor");
        CustomerEntity customerEntity=new CustomerEntity(1,"hashan",25);
        customerRepositery.save(customerEntity);
        return "d";
    }
}
