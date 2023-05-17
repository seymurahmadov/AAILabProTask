package com.example.aailabprotask.service;

import com.example.aailabprotask.entity.Order;
import com.example.aailabprotask.repo.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    private final OrderRepository orderRepository;

    public CustomerService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public ArrayList<Order> getProductsOfCustomer(int customerId){
        return orderRepository.findAllByCustomerId(customerId);
    }
}