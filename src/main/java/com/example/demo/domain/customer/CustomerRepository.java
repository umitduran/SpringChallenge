package com.example.demo.domain.customer;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
    //List<Customer> findCustomersByFirstName(Sort sort);
}
