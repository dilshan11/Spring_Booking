package com.second.controller;

import com.second.dto.CustomerDto;
import com.second.dto.LoginDto;
import com.second.entity.CustomerEntity;
import com.second.repositery.CustomerRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api")
public class CustomerController {

    @Autowired
    CustomerRepositery customerRepositery;

//    @CrossOrigin
    @GetMapping("customer")
    public String saveCustomer(){
        System.out.println("get mapping wor");
        CustomerEntity customerEntity=new CustomerEntity(1,"hashan",25);
        customerRepositery.save(customerEntity);
        return "customerEntity";
    }
    @CrossOrigin
    @PostMapping("login")
    public boolean checklogin(@RequestBody LoginDto loginDto){
        System.out.println(loginDto);
        return true;
    }

//    @PostMapping("login")
//    public boolean checklogin(){
//        System.out.println("loginD");
//        return true;
//    }
}
