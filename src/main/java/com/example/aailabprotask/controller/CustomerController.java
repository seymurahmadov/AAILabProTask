package com.example.aailabprotask.controller;

import com.example.aailabprotask.entity.Customer;
import com.example.aailabprotask.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }


    @GetMapping
    public ArrayList<Customer> getAllCustomers() {
        return service.getCustomer();
    }
}
