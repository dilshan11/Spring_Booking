package com.second.controller;

import com.second.dto.CustomerDto;
import com.second.dto.LoginDto;
import com.second.entity.CustomerEntity;
import com.second.repositery.CustomerRepositery;
import com.second.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

//    @CrossOrigin
    @GetMapping("customer")
    public String saveCustomer(){
        System.out.println("get mapping wor");
        CustomerDto customerDto=new CustomerDto(1,"hashan","dilshan","itisnesa","nana",1521);
       // customerRepositery.save(c);
        return "customerEntity";
    }

    @PostMapping("login")
    public CustomerEntity checklogin(@RequestBody LoginDto loginDto){
       return customerService.checklogin(loginDto);
    }

    @PostMapping("registerUser")
    public String saveRegisterDetails(@RequestBody CustomerDto customerDto){
        System.out.println(customerDto);
        return this.customerService.saveRegisterDetails(customerDto);
    }
}
