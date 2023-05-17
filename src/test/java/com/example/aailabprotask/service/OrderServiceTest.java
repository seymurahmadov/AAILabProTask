package com.example.aailabprotask.service;

import com.example.aailabprotask.entity.Customer;
import com.example.aailabprotask.entity.Order;
import com.example.aailabprotask.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {

    @InjectMocks
    private OrderService customerService;

    @Mock
    private OrderRepository repository;

    @Mock
    private Customer customer;


    @Test
    public void testGetProductsOfCustomer() {
        ArrayList<Order> list = new ArrayList<>();
        Order order = new Order();
        order.setProductName("HP");
        list.add(order);

        when(customerService.getProductsOfCustomer(Math.toIntExact(1))).thenReturn(
                list);

        ArrayList<Order> actualList =
                customerService.getProductsOfCustomer(1);

        assertEquals(actualList.get(0).getProductName(), list.get(0).getProductName());
    }
}