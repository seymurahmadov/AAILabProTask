package com.example.aailabprotask.repo;

import com.example.aailabprotask.entity.Customer;
import com.example.aailabprotask.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    ArrayList<Customer> findAll();
}
