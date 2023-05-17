package com.example.aailabprotask.controller;

import com.example.aailabprotask.entity.Order;
import com.example.aailabprotask.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final CustomerService customerService;

    public OrderController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ArrayList<Order> getOrderByCustomerId(@PathVariable int customerId){
        return customerService.getProductsOfCustomer(customerId);
    }

}
