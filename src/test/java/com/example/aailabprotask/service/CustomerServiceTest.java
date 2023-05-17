package com.example.aailabprotask.service;

import com.example.aailabprotask.entity.Customer;
import com.example.aailabprotask.entity.Order;
import com.example.aailabprotask.repo.OrderRepository;
import com.example.aailabprotask.service.CustomerService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static javafx.beans.binding.Bindings.or;
import static org.mockito.ArgumentMatchers.floatThat;
import static org.mockito.Mockito.when;

import static javafx.beans.binding.Bindings.when;


@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private OrderRepository repository;

    @Mock
    private Order order;

    @Mock
    private Customer customer;

    @Test
    public void testGetProductsOfCustomer() {
        when(customerService.getProductsOfCustomer(Math.toIntExact(customer.getId())))
                .thenReturn((ArrayList<Order>) Arrays.asList(new Order(1L, 1,"Siemens", 10)));

        List<Order> item = customerService.getProductsOfCustomer(Math.toIntExact(order.getId()));

        assertEquals(1,"aaaa");
//        assertEquals("HP Printer",order.getProductName());
//        assertEquals("Samsung TV",order.getProductName());
    }
}