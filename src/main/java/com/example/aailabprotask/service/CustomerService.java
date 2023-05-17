package com.example.aailabprotask.service;

import com.example.aailabprotask.entity.Customer;
import com.example.aailabprotask.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public ArrayList<Customer> getCustomer(){
       return customerRepository.findAll();
    }
}
