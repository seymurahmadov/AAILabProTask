package com.example.aailabprotask.service;

import com.example.aailabprotask.entity.Order;
import com.example.aailabprotask.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public ArrayList<Order> getProductsOfCustomer(int customerId){
        return orderRepository.findAllByCustomerId(customerId);
    }
}